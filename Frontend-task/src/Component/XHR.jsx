function XMR(){
    const xhr = new XMLHttpRequest();
    xhr.open("GET", "https://jsonplaceholder.typicode.com/posts");

    xhr.onload = function () {
        if (xhr.status === 200) {
            console.log("XHR Data:", JSON.parse(xhr.responseText));
        }
    };

    xhr.onerror = function () {
        console.log("Network Error");
    };
    xhr.send();

}
export default XMR;