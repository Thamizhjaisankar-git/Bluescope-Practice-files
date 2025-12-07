function CustomButton({label, onClick, backgroundColor="lightblue"}){
    return(
        <button style={{backgroundColor:backgroundColor, padding:"10px 30px", marginRight:"20px", borderRadius:"10px"}} onClick={onClick}>
            {label}
        </button>
    )
}
export default CustomButton;

