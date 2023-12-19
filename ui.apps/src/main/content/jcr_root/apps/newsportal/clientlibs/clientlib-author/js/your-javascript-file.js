document.addEventListener('DOMContentLoaded', function () {
    const responseContainer = document.getElementById('responseContainer');

    function handleResponse(response) {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.text();
    }

    function displayResponse(responseText) {
        responseContainer.textContent = responseText;
    }

    function makeRequest(method) {
        // Specify the resource type in the URL
        fetch('/bin/content/services/author', {
            method: method,
        })
        .then(handleResponse)
        .then(displayResponse)
        .catch(error => {
            console.error(`There was a problem with the ${method} request:`, error);
        });
    }

    document.getElementById('getButton').addEventListener('click', function () {
        makeRequest('GET');
    });

    document.getElementById('postButton').addEventListener('click', function () {
        makeRequest('POST');
    });

    document.getElementById('putButton').addEventListener('click', function () {
        makeRequest('PUT');
    });

    document.getElementById('deleteButton').addEventListener('click', function () {
        makeRequest('DELETE');
    });
});
