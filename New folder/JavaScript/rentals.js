function submit(){

    var Name=$('#name').val();
    var Phone=$('#phone').val();
    var Address=$('#address').val();
    var RentalPrice=$('#rental_price').val();
    var PropertyType=$('#property_type').val();
    var Detail=$('detail').val();

    fetch("http://localhost:8080/rentalprovider",{
        method:'POST',
        body:JSON.stringify({
            name:Name,
            phone:Phone,
            address:Address,
            property_type : PropertyType,
            price:RentalPrice,
            detail:Detail,
        

        }),
        headers:{
            'ContentType':'application/json',
            'Accept': 'application/json'
        }
    })

    $(`#name`).val('');
    $(`#phone`).val('');
    $(`#email`).val('');
    $(`#address`).val('');
    $(`#property_type`).val('');
   

}