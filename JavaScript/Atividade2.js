function substituirPares(array){
    if(!array.length)  return -1;
    for(let i = 0; i < array.length; i++){
        if(array[i] === 0){
            //Já é zero
        }else if(array[i] % 2 === 0){
            array[i] = 0;
        }
    }
    return array;

}

let array = [1,3,4,5,6,8,9,10,20,0,0,2]
console.log(substituirPares(array))