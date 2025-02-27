# 🧑‍💻 Comandos Git

## Inicializar repositório
```
git init
```

## Verificar repositórios remotos vinculados
```
git remote -v
```

## Clonar repositório
```
git clone URL-repo-remoto
```

## Vincular repositório local com remoto
```
git remote add origin URL-repo-remoto
```

## Clonar uma branch espeecífica de um repositório remoto
```
git clone URL-repo-remoto --branch nome-da-branch --single-branch
```

## Verificar status da árvore de trabalho
```
git status
```

## Verificar histórico
```
git log
```
## Verificar histórico detalhado
```
git reflog
```

## Adicionar arquivos na área de preparação (staging area)
```
git add nome-do-arquivo   //um arquivo

git add .                 //todos os arquivos
```

## Adicionar modificações no repositório remoto
```
git commit -m"mensangem descritiva"
```

## Restaurar estado anterior de um arquivo
```
git restore nome-do-arquivo
```


## Alterar mensagem do último commit
```
git commit --amend -m"nova mensagem"
```

## Desfazer o último commit
```
git reset --soft hash-do-commit   //retornar os arquivos posteriores ao commit indicado para a staging area

git reset --mixed hash-do-commit   //retornar os arquivos posteriores ao commit indicado para a árvore de trabalho

git reset --hard hash-do-commit   //exclui os arquivos posteriores ao commit indicado
```


## Remover arquivo adicionado a área de preparação (staging area)
```
git reset diretório-do-arquivo/nome-do-arquivo

//ou

git restore --staged diretório-do-arquivo/nome-do-arquivo
```

# Atualizar o repositório local com as modificações do remoto
```
git pull origin main
```

# Enviar alterações do repositório local para o remoto
```
git push origin main
```

# Criar uma nova branch
```
git checkout -b nome-da-branch
```

# Alterar branch atual 
```
git checkout nome-da-branch
```

# verificar o último commit da branch
```
git branch -v
```

# Listar branchs no repositório local
```
git branch
```

# Excluir uma branch
```
git branch -d nome-da-branch
```

# mesclar uma branch com a main
```
git merge nome-da-branch
```

# Atualizar o repositório local sem mesclar as modificações
```
git fetch origin main
```

# Verificar as diferenças entre branchs
```
git diff main origin/main
```

# Trazer as diferenças para o repositório local
```
git merge origin/main
```

# Clonar uma branch específica do repositório remoto
```
git clone URL-repo-remoto --branch nome-da-branch --single-branch
```

# Arquivar modificações 
```
git stash 
```

# Listar modificações arquivadas
```
git stash list
```

# Recuperar modificações arquivadas
```
git stach pop   //recuperar modificações e excluir a modificação mais recente

//ou

git stach apply   //recuperar modificações e manter a modificação mais recente
```
