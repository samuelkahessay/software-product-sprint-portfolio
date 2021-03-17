// Week 2 Fetch Commands 
// Write a function that calls fetch and adds the response to the webpage

/** Fetches the current date from the server and adds it to the page. */
async function showMessage() {
  const responseFromServer = await fetch('/hello');
  const jsonFromResponse = await responseFromServer.json();
  
// Determine a random quote 
randomQuoteIndex = Math.floor(Math.random() * jsonFromResponse.length)

// Print quote 
// console.log(jsonFromResponse[randomQuoteIndex]);

  const messageContainer = document.getElementById('message-container');
  messageContainer.innerText = jsonFromResponse[randomQuoteIndex];
}
