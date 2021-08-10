import React, { useState } from 'react'
import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';

const Input = ({ onSendMessage }) => {
    const [content, setContent] = useState("")

    let onChange = (e) => {
        setContent(e.target.value)
    }

    let onSubmit = () => {
        setContent("")
        onSendMessage(content);
    }

    return (
        <div className="message-input">
            <TextField
                className="inputField"
                label="Type your message here..."
                placeholder="Enter your message and press ENTER"
                onChange={e => onChange(e)}
                margin="normal"
                value={content}
                onKeyPress={event => {
                    if (event.key === 'Enter') {
                        onSubmit(content);
                    }
                }}
                style={{ height: "30px", width: "80%" }}
            />

            <Button variant="contained" color="primary" onClick={onSubmit}>
                Send
            </Button>
        </div>
    );
}


export default Input