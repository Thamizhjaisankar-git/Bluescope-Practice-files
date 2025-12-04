class UserCard extends HTMLElement {
    static get observedAttributes() {
      return ["name", "email"];
    }
  
    constructor() {
      super();
      this.shadow = this.attachShadow({ mode: "open" });
      this.render();
    }
  
    attributeChangedCallback() {
      this.render();
    }
  
    render() {
      this.shadow.innerHTML = `
        <style>
          .card {
            padding: 10px;
            background: #63c944ff;
            color: yellow;
            border-radius: 10px;
            margin: 10px;
            font-family: sans-serif;
          }
        </style>
  
        <div className="card">
          <h3>${this.getAttribute("name")}</h3>
          <p>${this.getAttribute("email")}</p>
        </div>
      `;
    }
  }
  
  customElements.define("user-card", UserCard);
  