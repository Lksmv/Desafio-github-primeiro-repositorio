# GIT

- https://git-scm.com/downloads

- https://github.com/

### Estados

- Modified

- Staged

- Comitted

## Comandos

    git help

###### Setar usuário

git config --global user.name "Nome"

###### Setar Email

git config --global user.email email@gmail.com

###### Listar Configs

git config --list

###### Criar repositorio local

git init

###### Verificar Status

git status

###### Adicionar arquivo/repositorio(Staged)

git add arq.txt 

git add *

###### Commitar arquivo

git commit arq.txt -m "mensagem"

###### Remover Arquivo

git rm arq.txt

###### Ver historico

git log

###### Ver Repositorios

git remote 

git remote -v

###### Vincular Repositorio local com remoto

git remote add origin <repositorio>

###### Enviar Arquivos/diretorios local para remoto

git push origin main/master

git push

###### Atualizar arquivos local conforme remoto

git pull     - branch atual

git fetch   - não aplicar na branch atual

###### Clonar repositorio remoto

git clone <repositorio>
