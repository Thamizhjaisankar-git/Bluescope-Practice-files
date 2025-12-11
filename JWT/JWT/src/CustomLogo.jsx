import defaultImg from "./assets/defaultimg-admin.png";

function CustomLogo({ children, src, style }) {
  const isEmpty = (!children || children === "") && !src;;
  const isImage = children && children.type === "img";
  const isText = typeof children === "string";
  const finalImage = src || (isImage ? children.props.src : null);

  return (
    <div
      style={{
        width: "70px",
        height: "70px",
        borderRadius: "50%",
        backgroundColor: "#e5e5e5ff",
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        overflow: "hidden",
        fontSize: "24px",
        fontWeight: "bold",
        
        ...style,
      }}
    >
     
      {finalImage && (
        <img src={finalImage} alt="avatar" style={{ width: "100%", height: "100%", objectFit: "cover" }} />
      )}

      {isText && <span>{children}</span>}

      {isEmpty && !finalImage && (
        <img src={defaultImg} alt="default avatar" style={{ width: "60%", height: "60%", objectFit: "cover" }} />
      )}
    </div>
  );
}

export default CustomLogo;
