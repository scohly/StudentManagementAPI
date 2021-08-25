import fetch from 'unfetch';

const checkStatus = response => {
    if (response.ok) {
        return response;
    }
    //convert non-2xx http response into errors:
    const error = new Error(response.statusText);
    error.response = response;
    return Promise.reject(error);

}

export const getAllStudents = () =>
    fetch("api/v1/students")
    .then(checkStatus);