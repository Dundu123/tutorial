document.addEventListener('DOMContentLoaded', function () {
    const loadAuthorDetailsButton = document.getElementById('loadAuthorDetails');
    const authorDetailsDiv = document.getElementById('authorDetails');

    loadAuthorDetailsButton.addEventListener('click', function () {
        // Replace with the URL of your servlet
        const servletUrl = '/bin/newspoetal/services/authordetails';

        fetch(servletUrl)
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.text();
            })
            .then(data => {
                // Handle the response data here
                authorDetailsDiv.textContent = data;
            })
            .catch(error => {
                console.error('There was a problem with the fetch operation:', error);
            });
    });
});
