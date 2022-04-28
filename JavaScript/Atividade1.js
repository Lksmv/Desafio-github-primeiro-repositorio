function verificaPalindromo(string) {
    if(!string) return;
    string = string.replace(/ /g,"").toLowerCase()
    return string.split("").reverse().join("") === string;
}
console.log(verificaPalindromo("O romano acata amores a damas amadas e Roma ataca o namoro"))
