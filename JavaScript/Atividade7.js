//tratamento de erros

function validaArray(array,num){
    try{

    
    
    if(!array && !num){
        throw new ReferenceError("Sem parametros");
    }

    if(typeof array !== 'object'){
        throw new TypeError("tipo do array diferente de object");
    }

    if(typeof num !== 'number'){
        throw new TypeError("Tipo do num diferente de number")
    }

    if( array.length !== num){
        throw RangeError('Tamanho invalido')
    }

    return array;

    }catch(e){
        if(e instanceof ReferenceError){
            console.log('ReferenceError')
            console.log(e.message)
        }else if( e instanceof TypeError){
            console.log('TypeError')
            console.log(e.message)
        }else if (e instanceof RangeError){
            console.log('RangeError')
            console.log(e.message)
        }else{
            console.log('Erro diferente do esperado')
            console.log(e)
        }
    }

}

console.log(validaArray([1,2,3,4,5],5));