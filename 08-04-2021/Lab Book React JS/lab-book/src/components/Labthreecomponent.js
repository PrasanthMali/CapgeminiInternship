import React from 'react';

class Lab3 extends React.Component{
    
    constructor(){
        super();
        this.state={
             Id:'',
             Name:'',
             Cost:'',
             Online:'',
             Category:'',
             store:''
        }

        this.handleInputChange = this.handleInputChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleInputChange(event){
        this.setState({
            [event.target.name]:event.target.value
        })
    }

    handleSubmit(event) {
        alert('A product is added with product name  ' + this.state.productname);
      }

    render(){

        return(
            <div>
                <h2>React JS Lab Book - 03</h2>
            <form onSubmit={this.handleSubmit}>
                <label> Product Id:<input type="text" name="productid" value={this.state.productid} onChange={this.handleInputChange}/></label><br></br><br></br>
                <label> Product Name:<input type="text" name="productname" value={this.state.productname} onChange={this.handleInputChange}/></label><br></br><br></br>
                <label> Product Cost:<input type="text" name="productcost" value={this.state.productcost} onChange={this.handleInputChange}/></label><br></br><br></br>
                <label>Product Category:<select value={this.state.select} name="productcategory" onChange={this.handleInputChange}><br></br><br></br>
                    <option value="Grocery">Grocery</option>
                    <option value="Mobile">Mobile</option>
                    <option value="Electronics">Electronics</option>
                    <option value="Clothes">Clothes</option>
                </select></label><br></br><br></br>
                <label>Product Online:<input type="radio" value="Yes" name="Product Online" onChange={this.handleInputChange} mt-4 mr-4/>Yes
                <input type="radio" value="No" name="Product Online" onChange={this.handleInputChange} mt-4 mr-4/>No</label><br></br><br></br>
                <label>Available in store:<input type="checkbox" value="Big Bazar" name="Available in store" onChange={this.handleInputChange}/>Big Bazar
                <input type="checkbox" value="DMart" name="Available in Store" onChange={this.handleInputChange} mt-5 mr-5/>DMart
                <input type="checkbox" value="Reliance" name="Available in store" onChange={this.handleInputChange}/>Reliance
                <input type="checkbox" value="Mega Store" name="Available in store" onChange={this.handleInputChange}/>Mega Store
                </label><br></br><br></br>
                <input type="submit" value="Add Product" />
            </form>
            <h3>PRODUCT ID:{this.state.productid}</h3>
            <h3>PRODUCT NAME:{this.state.productname}</h3>
            <h3>PRODUCT COST:{this.state.productcost}</h3>
            <h3>PRODUCT CATEGORY:{this.state.productcategory}</h3>
            </div>
        );
    }
}
export default Lab3;