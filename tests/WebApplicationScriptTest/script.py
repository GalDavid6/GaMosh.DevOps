import requests
import json

# URLs to test
urls = [
    'http://localhost:9000/logs',
    'http://localhost:9000/transaction',
    'http://localhost:9000/'
]

# Test each URL
for url in urls:
    try:
        print("---------------")
        response = requests.get(url)
        response.raise_for_status()  # Raise an exception for non-2xx status codes
        if url.endswith('/logs'):
            logs = response.json()
            expected_logs = json.dumps(logs, separators=(',', ':'))  # Converting the json to string
            if response.status_code == 200 and response.text == expected_logs:
                print(f"SUCCESS: {url} returned the expected logs.")
            else:
                print(f"FAILURE: {url} did not return the expected logs.")

        else:
            # Test for other routes
            if response.status_code == 200:
                print(f"SUCCESS: {url} returned a new log.")
            else:
                print(f"FAILURE: {url} did not return a new log.")
        print(response.text)

    except requests.exceptions.HTTPError as err:
        print(f"ERROR: Failed to make a request to {url}. {err}")
    except requests.exceptions.RequestException as err:
        print(f"ERROR: An error occurred while processing the request to {url}. {err}")



