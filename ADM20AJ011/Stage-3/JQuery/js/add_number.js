$('#btn_sum').click(function(){
    let num1 = $('#txtNum1').val();
    let num2 = $('#txtNum2').val();
    let result = 'Enter both the numbers'
    let color = 'red'

    if(num1.length>0 && num2.length>0){
        num1 = Number(num1);
        num2 = parseInt(num2);

        result = num1 + num2;
        color = 'green'    
    }
    //console.log(result)
    $('#txtResult').text(result)
                .css('color',color)
})