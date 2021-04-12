import React, { useState } from "react";

function Login({ handleOnSubmit }) {
    const [user, setUser] = useState("");

    const handleOnChange = (e) => {
        setUser(e.target.value);
    };

    const handleSubmit = () => {
        handleOnSubmit(name);
    };

    return (
        <div>
            <form onSubmit={handleSubmit}>
                <input
                    placeholder="사용할 닉네임을 입력하세요."
                    value={user}
                    onChange={handleOnChange}
                />
                <button type="submit">Go!</button>
            </form>
        </div>
    );
}

export default Login;