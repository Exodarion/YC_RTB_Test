function calculate()
{
    let waarde1 = Number.parseInt(document.getElementById("invoer1").value);
    let waarde2 = Number.parseInt(document.getElementById("invoer2").value);
    let additionResult = waarde1 + waarde2;
    let subtractResult = waarde1 - waarde2;

    // Alert Values
    // alert("additionResult = " + additionResult);
    // alert("subtractResult = " + subtractResult);
    // alert("divisionResult = " + waarde1 / waarde2);
    // alert("multiplyResult = " + waarde1 * waarde2);

    //Report whether the checkbox was checked
    let isChecked = document.getElementById("kaku").checked;
    if(isChecked == true)
        console.log("Is Checked");
    else
        console.log("UnChecked");

    //Paragraph Values
    document.getElementById("result1").textContent = "additionResult = " + additionResult;
    document.getElementById("result2").textContent = "subtractResult = " + subtractResult;
    document.getElementById("result3").textContent = "divisionResult = " + waarde1 / waarde2;
    document.getElementById("result4").textContent = "multiplyResult = " + waarde1 * waarde2;
}

function emptyBody()
{
    document.getElementsByTagName('body')[0].innerHTML = '';
    document.getElementsByTagName('head')[0].innerHTML = '';
}