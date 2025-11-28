function FetchAPI(){
    async function getPosts() {
        try {
          const response = await fetch("https://jsonplaceholder.typicode.com/posts");
          const data = await response.json();
          console.log("Posts:", data);
        } catch (error) {
          console.log("Error:", error);
        }
      }
      
      getPosts();
}

export default FetchAPI;