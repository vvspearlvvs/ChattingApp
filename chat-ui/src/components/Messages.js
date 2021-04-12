import React from 'react'

const Messages = ({ messages, currentUser }) => {

    const formattingTimestamp = (timestamp) => {
        const date = new Date(timestamp);
        let hour = date.getHours() < 10 ? `0${date.getHours()}` : date.getHours();
        let min =
            date.getMinutes() < 10 ? `0${date.getMinutes()}` : date.getMinutes();
        return `${hour}:${min}`;
    };

    let renderMessage = (message) => {
        const { sender, content, color } = message;
        console.log("renderUser "+sender)
        console.log("renderMessage  "+content)
        console.log("rendercolor  "+color)
        const messageFromMe = currentUser.username === message.sender;
        const className = messageFromMe ? "Messages-message currentUser" : "Messages-message";
        return (
            <li className={className}>
                <span
                    className="avatar"
                    style={{ backgroundColor: color }}
                />
                <div className="Message-content">
                    <div className="username">
                        {sender}
                    </div>
                    <div className="text">{content}</div>
                    <div className="timestamp">
                        {formattingTimestamp(message.timestamp)}
                    </div>
                </div>
            </li>
        );
    };

    return (
        <ul className="messages-list">
            {messages.map(msg => renderMessage(msg))}
        </ul>
    );
}


export default Messages