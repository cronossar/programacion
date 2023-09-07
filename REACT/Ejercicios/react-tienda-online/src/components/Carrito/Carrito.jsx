
import Card from "../../images/img08.jpg";

export const Carrito = () => {
  return (
    <div className="carritos">
       <div className="carrito">
        <div className="carrito_close">
          <box-icon name="x"></box-icon>
        </div>
        <h2>Su carrito</h2>
        <div className="carrito_center">

            <div className="carrito_item">
                <img src={Card} alt="" />
            </div>
            <div>
                <h3>Title</h3>
                <p className="price">$345</p>
            </div>
            <div>
                <box-icon Name="up-arrow" type="solid"></box-icon>
                <p className="cantidad">1</p>
                <box-icon Name="down-arrow" type="solid"></box-icon>
            </div>
            <div className="remove_item">
            <box-icon Name="trash" type="solid"></box-icon>
            </div>
        </div>
        <div className="carrito_footer">
            <h3> Total: $2334 </h3>
            <button className="btn">Payment</button>
        </div>

      </div>
    </div>
  );
};

export default Carrito;