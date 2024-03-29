import React from "react";

export default class App05 extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            msg : '초기값'
        }
        this.inputHandler = this.inputHandler.bind(this);
    }

    inputHandler(e){
        console.log(e.target.value);
        this.setState({msg : e.target.value})
    }

    render(){
        return (
            <div>
                <h1>class form</h1>
                <form>
                    <label>
                        <input name="" value={this.state.msg} onChange={this.inputHandler}/>
                    </label>
                </form>
                <div>
                    <button type="submit">전달</button>
                </div>
            </div>
        );
    }
}