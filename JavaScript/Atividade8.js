//Orientação a objetos

class ContaBancaria {
    constructor(agencia,numero,tipo){
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this._saldo = 0;
    }

    get saldo(){
        return this._saldo;
    }

    set saldo(valor){
        this._saldo = valor;
    }

    sacar(valor){
        if(valor >this._saldo){
            return "Saldo invalido";
        }
        return this._saldo = this._saldo - valor;
    }

    depositar(valor){
        return this._saldo = this._saldo + valor;
    }
}

class contaCorrente extends ContaBancaria{
    constructor(agencia,numero,cartaoCredito){
        super(agencia,numero);
        this.tipo = 'corrente';
        this._cartaoCredito = cartaoCredito;
    }

    get cartaoCredito(){
        return this._cartaoCredito;
    }

    set cartaoCredito(valor){
        this._cartaoCredito = valor;
    }
}

class contaPoupanca extends ContaBancaria {
    constructor(agencia,numero){
        super(agencia,numero);
        this.tipo = 'poupança'
    }
}

class contaUniversitaria extends ContaBancaria{
    constructor(agencia,numero){
        super(agencia,numero);
        this.tipo = 'universitária'
    }

    sacar(valor){
        if(valor > 500){
            return 'Negada';
        }

        this._saldo = this._saldo - valor;
    }
}