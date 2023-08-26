function myFunc(){
    
    // var frm=document.getElementById(del)[0];

    var Name=$(`#name`).val();
    var Phone= $(`#phone`).val();
    var Email= $(`#email`).val();
    var Address= $(`#address`).val();
    var PropertyType= $(`#property_type`).val();

    fetch('http://localhost:8080/seller',{
        method: 'POST',
        body : JSON.stringify({
            name:Name,
            phone:Phone,
            email:Email,
            address: Address,
            propertyType:PropertyType,
        }),
        headers: {
            'Content-type': 'application/json',
            'Accept': 'application/json'
          },
    })
    // .then((response)=>response.json())
    // .then((obj)=>{console.log(JSON.parse(obj))});

    $(`#name`).val('');
    $(`#phone`).val('');
    $(`#email`).val('');
    $(`#address`).val('');
    $(`#property_type`).val('');
   

    
}

