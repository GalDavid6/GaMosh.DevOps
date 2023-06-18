import requests

BASE_URL = 'http://localhost:8080/'


def test_get_logs():
    response = requests.get(BASE_URL + "/logs")
    assert response.status_code == 200


def test_create_new_transaction():
    data = {}
    response = requests.post(BASE_URL + "/transaction", data)
    assert response.status_code == 201
