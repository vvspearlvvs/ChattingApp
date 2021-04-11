import Axios from "axios";

const api = Axios.create({
    baseURL: "http://localhost:8080/kafka",
});

const chatAPI = {
    getMessages: (groupId) => {
        console.log("Calling get messages from API");
        return api.get(`/messages/${groupId}`);
    },

    sendMessage: (username, text) => {
        console.log("sendMessage");
        let msg = {
            user: username,
            message: text,
        };
        return api.post(`/publish`, msg, {
            headers: { "Content-Type": "application/json" },
        });
    },
};

export default chatAPI;