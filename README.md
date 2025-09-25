# 📱 SmartContacts – Desafio 

## Sobre  
Este é um **mini-sistema de agenda inteligente** desenvolvido em **Kotlin**, criado como desafio prático para reforçar conceitos como:  

- Funções de expressão única  
- Parâmetros padrão  
- Listas mutáveis (`mutableListOf`)  
- Funções de ordem superior (`filter`, `map`, etc.)  

O objetivo é **simular uma agenda de contatos simples**, colocando em prática recursos fundamentais do Kotlin.  

📖 Este desafio faz parte do **Programa de Capacitação em Desenvolvimento Android e Multiplataforma Flutter – Trilha Android Nativo**, promovido pela **Venturus**.  

---

## 📌 Funcionalidades  

1. **Adicionar Contato**  
   - Nome (**Obrigatório**)  
   - Favorito (**Boolean, Obrigatório**)  
   - Telefone (Opcional → padrão = `"Sem número"`)  

2. **Listar Favoritos**  
   - Retorna apenas os nomes dos contatos favoritos, em ordem alfabética.  

3. **Buscar Contato por Nome**  
   - Utiliza `filter` para retornar o(s) contato(s) cujo nome contenha o termo pesquisado.  

4. **Enviar Mensagem**  
   - Mensagem (**Obrigatório**)  
   - Remetente (Opcional → padrão = `"Sistema"`)  

---