import pyodbc

# Importa os módulos para construção da tela
from tkinter import *

# Importa os módulos mais avançados para construção da tela
from tkinter import ttk


# print(pyodbc.drivers())

# Cria uma função
def verifica_credenciais():
    # Estabelece conexão com o banco de dados
    conexao = pyodbc.connect("Driver={SQLite3}; Server=localhost;Database=Projeto_Compras.db")
    cursor = conexao.cursor()

    # FROM - De
    # WHERE - Onde
    cursor.execute("Select * From Usuarios Where Nome = ? AND Senha = ?", (nome_usuario_entry.get(), senha_entry.get()))

    # fetchall - Passa os dados do banco para a variável
    # recebendo o resultado da Query
    usuario = cursor.fetchall()

    # if - se
    if usuario:

        print("Logado com sucesso!")

        # Destruindo a janela de 'LOGIN'
        janela_principal.destroy()

        def lista_dados():

            # Limpar os valores da treeview
            for linha in treeview.get_children():
                treeview.delete(linha)

            # Executa os valores retornados pelo comando SQL em uma variável
            cursor.execute("SELECT * From Produtos")

            # Armazena os valores retornados pelo comando SQL em uma variável
            valores = cursor.fetchall()

            # Popula a treeview com os dados do banco de dados
            for linha in valores:
                treeview.insert("", "end",
                                values=(linha[0], linha[1], linha[2], linha[3]))

        # Criando uma nova janela para a tela principal
        janela = Tk()
        janela.title("Cadastro de Produtos")

        # Define a cor do fundo da janela
        janela.configure(background="#F5F5F5")

        # Coloca tela em tela cheia
        janela.attributes("-fullscreen", True)

        # Cria um Label chamado nome
        Label(janela, text="Nome do Produto",
                      font="Arial 16",
                      background="#F5F5F5").grid(row=0, column=2, padx=10,
                                                                                          pady=10)

        # sticky - expande para as laterais ocupando o espaço em brando
        # sticky - NSEW - (Norte, Sul, Leste e Oeste)
        # row - linha | column - Coluna | padx - Espaço laterais
        nome_produto = ttk.Combobox(janela, font="Arial 16")
        nome_produto.grid(row=0, column=3, padx=10, pady=10, sticky="NSEW")

        # Pega valore únicos da coluna NomeProduto e ordena em ordem crescente
        cursor.execute(
            "SELECT DISTINCT NomeProduto FROM Produtos ORDER BY NomeProduto ASC")

        # Armazena os valores retornados pelo comando SQL em uma variável
        valores = cursor.fetchall()

        # Cria uma lista com os valores retornados
        nomes_produtos = [valor[0] for valor in valores]

        # Define a lista de valores da combobox nome_produto
        nome_produto['values'] = nomes_produtos

        # ---------------

        # Cria um Label chamado nome
        Label(janela, text="Descrição do Produto",
                      font="Arial 16",
                      background="#F5F5F5").grid(row=0, column=5, padx=10, sticky="NSEW",                                                                              pady=10)

        # sticky - expande para as laterais ocupando o espaço em brando
        # sticky - NSEW - (Norte, Sul, Leste e Oeste)
        # row - linha | column - Coluna | padx - Espaço laterais
        descricao_produto = ttk.Combobox(janela, font="Arial 16")
        descricao_produto.grid(row=0, column=6, padx=10, pady=10, sticky="NSEW")

        # Pega valore unicos da coluna NomeProduto e ordena em ordem crescente
        cursor.execute(
            "SELECT DISTINCT Descricao FROM Produtos ORDER BY Descricao ASC")

        # Armazena os valores retornados pelo comando SQL em uma variável
        valoresDescricao = cursor.fetchall()

        # Cria uma lista com os valores retornados
        descricao_produtos = [valor[0] for valor in valoresDescricao]

        # Define a lista de valores da combobox nome_produto
        descricao_produto['values'] = descricao_produtos

        def cadastrar():

            # Cria uma nova janela em segundo plano
            janela_cadatrar = Toplevel(janela)
            janela_cadatrar.title("Cadastrar Produto")

            # Altera a cor de fundo
            janela_cadatrar.config(bg="#FFFFFF")

            # Define a largura e altura da janela
            largura_janela = 500
            altura_janela = 250

            # Obtém a largura e altura da tela do computador
            largura_tela = janela_cadatrar.winfo_screenwidth()
            altura_tela = janela_cadatrar.winfo_screenheight()

            # Calcula a posição da janela para centralizar na tela
            pos_x = (largura_tela // 2) - (largura_janela // 2)
            pos_y = (altura_tela // 2) - (altura_janela // 2)

            # Define a posição da janela
            janela_cadatrar.geometry('{}x{}+{}+{}'.format(
                largura_janela, altura_janela, pos_x, pos_y))

            Label(janela_cadatrar, text="Nome do Produto:", font="Arial 14",
                                   bg="#FFFFFF").grid(
                                   row=0, column=0,padx=10, pady=10, sticky=W)
            nome_produto_cadastrar = Entry(janela_cadatrar, font="Arial 14")
            nome_produto_cadastrar.grid(row=0, column=1, padx=10, pady=10)

            # ------------
            Label(janela_cadatrar, text="Descrição do Produto:",
                                   font="Arial 14", bg="#FFFFFF").grid(
                                   row=1, column=0, padx=10, pady=10, sticky=W)
            descricao_produto_cadastrar = Entry(janela_cadatrar, font="Arial 14")
            descricao_produto_cadastrar.grid(row=1, column=1, padx=10, pady=10)

            # ------------
            Label(janela_cadatrar, text="Preço do Produto:",
                  font="Arial 14", bg="#FFFFFF").grid(row=2, column=0,
                                                                                                 padx=10, pady=10,
                                                                                                 sticky=W)
            preco_produto_cadastrar = Entry(janela_cadatrar, font="Arial 14")
            preco_produto_cadastrar.grid(row=2, column=1, padx=10, pady=10)

            def salvar_dados():

                # Crie uma tupla com os valores dos campos de texto
                novo_produto_cadastrar = (nome_produto_cadastrar.get(),
                                          descricao_produto_cadastrar.get(),
                                          preco_produto_cadastrar.get())

                # Executa um comando SQL para inserir os dados na tabela de produtos
                cursor.execute(
                    "INSERT INTO Produtos (NomeProduto, Descricao, Preco) VALUES (?, ?, ?)",
                               novo_produto_cadastrar)

                # Confirma o salvamento no banco de dados
                conexao.commit()

                # Chama a função para listar os dados e atualizar na treeview
                lista_dados()

                # Fecha a janel após salvar
                janela_cadatrar.destroy()

                # Chama a função que soma a coluna de preço e conta a quantidade de linha
                calcula_soma_preco()

            botao_salvar_dados = Button(janela_cadatrar, text="Salvar",
                                        command=salvar_dados, font="Arial 20")
            botao_salvar_dados.grid(
                row=4, column=0, columnspan=2, sticky="NSEW", pady=5, padx=5)

            botao_cancelar = Button(janela_cadatrar, text="Cancelar",
                                    command=janela_cadatrar.destroy, font="Arial 20")
            botao_cancelar.grid(
                row=5, column=0, columnspan=2, sticky="NSEW", pady=5, padx=5)

            # Centralizar os widgets na janela
            for i in range(5):
                janela_cadatrar.grid_rowconfigure(i, weight=1)

            for i in range(2):
                janela_cadatrar.grid_columnconfigure(i, weight=1)

        botao_gravar = Button(janela, text="Novo",
                              command=cadastrar, font="Arial 26")
        botao_gravar.grid(row=5, column=0, columnspan=4, sticky="NSEW", pady=5)

        # --------------------------------

        # Define o estilo da treeview
        style = ttk.Style(janela)

        treeview = ttk.Treeview(janela, style="mystyle.Treeview")
        style.theme_use("default")
        style.configure("mystyle.Treeview", font="Arial 14")

        # Define as coluna da treeview
        colunas = ["ID", "Nome do Produto", "Descrição", "Preço"]
        treeview["columns"] = colunas

        # Chama a função para listar os valores do banco de dados na Treeview
        lista_dados()

        # for - para
        # Popula o cabeçalho da Treeview
        for col in colunas:
            treeview.heading(col, text=col)

        # Exibo a treeview na tela
        treeview.grid(row=4, column=0, columnspan=10, padx=5, pady=5, sticky="NSEW")

        # Oculto a primeira coluna deixando a largura como 0
        treeview.column("#0", width=0, stretch=False)

        def limpaDados():

            # Limpa todos os dados da treeview
            for linha in treeview.get_children():
                treeview.delete(linha)

        # ---------------------------------------------------

        soma_label = Label(janela, text="Total: R$ 0.00",
                           font="Arial 20", background="#FFFFFF")
        soma_label.grid(row=3, column=0, columnspan=10, sticky="NSEW", padx=10, pady=10)

        def calcula_soma_preco():

            total = 0
            qtd_registros = 0

            # for - para
            for linha in treeview.get_children():

                valores = treeview.item(linha)['values']

                # if - se
                if valores:
                    # total = total + preco
                    total += float(valores[3])  # Coluna de preço
                    qtd_registros += 1

            soma_label.config(text=f"Total: R$ {total:.2f} - Itens: {qtd_registros}")

        # Chama a função que soma a coluna de preço e conta a quantidade de linha
        calcula_soma_preco()

        def editar_dados(event):

            # Obtém o item selecionado da treeview
            item_selecionado = treeview.selection()[0]

            # Obtém os valores do item selecionado
            valores_selecionados = treeview.item(item_selecionado)['values']

            # Cria uma nova janela em segundo plano
            janela_edicao = Toplevel(janela)
            janela_edicao.title("Editar Produto")

            # Altera a cor de fundo
            janela_edicao.config(bg="#FFFFFF")

            # Define a largurae altura da janela
            largura_janela = 500
            altura_janela = 250

            # Obtem a largura e altura da tela do computador
            largura_tela = janela_edicao.winfo_screenwidth()
            altura_tela = janela_edicao.winfo_screenheight()

            # Calcula a posição da janela para centralizar na tela
            pos_x = (largura_tela // 2) - (largura_janela // 2)
            pos_y = (altura_tela // 2) - (altura_janela // 2)

            # Define a posição da janela
            janela_edicao.geometry('{}x{}+{}+{}'.format(largura_janela, altura_janela, pos_x, pos_y))

            Label(janela_edicao, text="Nome do Produto:", font="Arial 14", bg="#FFFFFF").grid(row=0, column=0,
                                                                                              padx=10, pady=10,
                                                                                              sticky=W)
            nome_produto_edicao = Entry(janela_edicao, font="Arial 14",
                                        textvariable=\
                                            StringVar(value=valores_selecionados[1]))
            nome_produto_edicao.grid(row=0, column=1, padx=10, pady=10)

            # ------------
            Label(janela_edicao, text="Descrição do Produto:", font="Arial 14", bg="#FFFFFF").grid(row=1, column=0,
                                                                                                   padx=10, pady=10,
                                                                                                   sticky=W)
            descricao_produto_edicao = Entry(janela_edicao, font="Arial 14",
                                             textvariable=\
                                        StringVar(value=valores_selecionados[2]))
            descricao_produto_edicao.grid(row=1, column=1, padx=10, pady=10)

            # ------------
            Label(janela_edicao, text="Preço do Produto:", font="Arial 14", bg="#FFFFFF").grid(row=2, column=0,
                                                                                               padx=10, pady=10,
                                                                                               sticky=W)
            preco_produto_edicao = Entry(janela_edicao, font="Arial 14",
                                            textvariable=\
                                            StringVar(value=valores_selecionados[3]))
            preco_produto_edicao.grid(row=2, column=1, padx=10, pady=10)

            def salvar_edicao():

                novo_nome = nome_produto_edicao.get()
                nova_descricao = descricao_produto_edicao.get()
                novo_preco = preco_produto_edicao.get()

                # Atualiza os valores do item selecionado na treeview
                treeview.item(item_selecionado, values=(valores_selecionados[0], novo_nome, nova_descricao, novo_preco))

                # Executa um comando SQL para alterar os dados na tabela de produtos
                cursor.execute("UPDATE Produtos SET NomeProduto = ?, Descricao = ?, Preco = ? WHERE ID = ?",
                               (novo_nome, nova_descricao, novo_preco, valores_selecionados[0]))

                # Confirma o salvamento no banco de dados
                conexao.commit()

                # Chama a função para listar os dados e atulizar na treeview
                lista_dados()

                # Chama a função que soma a coluna de preço e conta a quantidade de linha
                calcula_soma_preco()

                # Fecha a janel após salvar
                janela_edicao.destroy()

            botao_salvar_edicao = Button(janela_edicao,  text="Editar",
                                                         command=salvar_edicao,
                                                         font="Arial 16",
                                                         background="#008000",
                                                         foreground="#FFFFFF")
            botao_salvar_edicao.grid(row=4, column=0, pady=20, padx=20)

            def deletar_registro():

                # Recupera o id do registro
                selected_item = treeview.selection()[0]

                id_selecionado = treeview.item(selected_item)['values'][0]

                # Deleta o registro do banco de dados
                # FROM - De
                # WHERE - Onde
                cursor.execute("DELETE FROM Produtos WHERE Id=?", (id_selecionado,))

                # Confirma o salvamento no banco de dados
                conexao.commit()

                # Fecha a janel após salvar
                janela_edicao.destroy()

                # Chama a função para listar os dados e atulizar na treeview
                lista_dados()

                # Chama a função que soma a coluna de preço e conta a quantidade de linha
                calcula_soma_preco()

            botao_deletar_edicao = Button(janela_edicao, text="Deletar",
                                                         command=deletar_registro,
                                                         font="Arial 16",
                                                         background="#FF0000",
                                                         foreground="#FFFFFF")
            botao_deletar_edicao.grid(row=4, column=1, pady=20, padx=20)

            # Centralizar os widgets na janela
            for i in range(5):
                janela_edicao.grid_rowconfigure(i, weight=1)

            for i in range(2):
                janela_edicao.grid_columnconfigure(i, weight=1)

        # Evento de duplo clique na treeview para chamar a tela de editar dados
        treeview.bind("<Double-1>", editar_dados)

        def filtrar_dados(nome_produto, descricao_produto):

            # verifica se as combobox estão vazio
            if nome_produto.get() == "" and descricao_produto.get() == "":
                # Listo todos os dados
                lista_dados()

                # Chama a função que soma a coluna de preço e conta a quantidade de linha
                calcula_soma_preco()

                # Saio da função
                return

            # Monta a consulta SQL dinamicamente
            sql = "SELECT * FROM Produtos"

            params = []

            if nome_produto.get():
                # sql = SELECT * FROM Produtos WHERE NomeProduto LIKE ?
                sql += " WHERE NomeProduto LIKE ?"
                params.append('%' + nome_produto.get() + '%')

            if descricao_produto.get():

                if nome_produto.get():

                    sql += " AND"

                else:

                    sql += " WHERE"
                sql += " Descricao LIKE ?"
                params.append('%' + descricao_produto.get() + '%')

            cursor.execute(sql, tuple(params))
            produtos = cursor.fetchall()

            limpaDados()

            for dado in produtos:
                treeview.insert("", "end",
                                values=(dado[0], dado[1], dado[2], dado[3]))

            # Chama a função que soma a coluna de preço e conta a quantidade de linha
            calcula_soma_preco()

        # Quando digitar qualquer letra na combobox faz o filtro
        nome_produto.bind('<KeyRelease>', lambda e: filtrar_dados(nome_produto, descricao_produto))
        descricao_produto.bind('<KeyRelease>', lambda e: filtrar_dados(nome_produto, descricao_produto))

        # Quando selecionar qualquer item da combobox faz o filtro
        nome_produto.bind('<<ComboboxSelected>>', lambda e: filtrar_dados(nome_produto, descricao_produto))
        descricao_produto.bind('<<ComboboxSelected>>', lambda e: filtrar_dados(nome_produto, descricao_produto))

        def deletar():

            # Recupera o id do registro
            selected_item = treeview.selection()[0]

            id_selecionado = treeview.item(selected_item)['values'][0]

            # Deleta o registro do banco de dados
            # FROM - De
            # WHERE - Onde
            cursor.execute("DELETE FROM Produtos WHERE Id=?", (id_selecionado,))

            # Confirma o salvamento no banco de dados
            conexao.commit()

            # Chama a função para listar os dados e atualizar na treeview
            lista_dados()

            # Chama a função que soma a coluna de preço e conta a quantidade de linha
            calcula_soma_preco()

        botao_deletar = Button(janela,
                               text="Deletar", command=deletar, font="Arial 26")
        botao_deletar.grid(row=5, column=4, columnspan=4, sticky="NSEW", pady=5)

        # --------------------------------

        # Configura a janela para utilizar a barra de menus criada
        menu_barra = Menu(janela)
        janela.config(menu=menu_barra)

        # Fixa o menu na barra
        menu_arquivo = Menu(menu_barra, tearoff=0)
        menu_barra.add_cascade(label="Arquivo", menu=menu_arquivo)

        # Cria uma opção no menu "Arquivo" chamada "Cadastrar"
        menu_arquivo.add_command(label="Cadastrar", command=janela.destroy)

        # Cria uma opção no menu "Arquivo" chamada "Sair"
        menu_arquivo.add_command(label="Sair", command=janela.destroy)

        # Inicia a janela
        janela.mainloop()

        # Fecha o cursor e a conexão do banco de dados
        cursor.close()
        conexao.close()

    else:

        mensagem_lbl = Label(janela_principal,
                             text="Nome de usuário ou senha incorreta",
                             fg="red")
        mensagem_lbl.grid(row=3, column=0, columnspan=2)


# Cria a janela principal para a tela de Login
janela_principal = Tk()
janela_principal.title("Tela de Login")
janela_principal.config(bg="#F5F5F5")

# https://phylos.net/2021-10-04/tabela-de-cores-html-css

# Define a largura e altura da janela
largura_janela = 450
altura_janela = 300

# Obtem a largura e altura da tela do computador
largura_tela = janela_principal.winfo_screenwidth()
altura_tela = janela_principal.winfo_screenheight()

# Calcula a posição da janela para centralizar na tela
pos_x = (largura_tela // 2) - (largura_janela // 2)
pos_y = (altura_tela // 2) - (altura_janela // 2)

# Define a posição da janela
janela_principal.geometry('{}x{}+{}+{}'.format(largura_janela, altura_janela, pos_x, pos_y))

# Criando os rótulos que são os label
titulo_lbl = Label(janela_principal, text="Tela de Login",
                                     font="Arial 20",
                                     foreground="blue",
                                     background="#F5F5F5")
titulo_lbl.grid(row=0, column=0, columnspan=2, padx=20, pady=20)

nome_usuario_lbl = Label(janela_principal, text="Nome do Usuário",
                                           font="Arial 14",
                                           foreground="black",
                                           background="#F5F5F5")

# sticky - expande para as laterais oculpando o espaço em brando
# sticky - NSEW - (Norte, Sul, Leste e Oeste)
nome_usuario_lbl.grid(row=1, column=0, sticky="e")

senha_usuario_lbl = Label(janela_principal, text="Senha",
                                            font="Arial 14",
                                            foreground="black",
                                            background="#F5F5F5")

# sticky - expande para as laterais ocupando o espaço em brando
# sticky - NSEW - (Norte, Sul, Leste e Oeste)
senha_usuario_lbl.grid(row=2, column=0, sticky="e")

# Criando os campos de entrada de dados
nome_usuario_entry = Entry(janela_principal, font="Arial 18")
nome_usuario_entry.grid(row=1, column=1, pady=10)

senha_entry = Entry(janela_principal, font="Arial 18", show="*")
senha_entry.grid(row=2, column=1, pady=10)

# Criando os botões para 'LOGAR' e SAIR
entrar_btn = Button(janela_principal, text="Entrar",
                    font="Arial 14",
                    command=verifica_credenciais)
entrar_btn.grid(row=4, column=0, columnspan=2, padx=20, pady=10, sticky="NSEW")

sair_btn = Button(janela_principal, text="Sair",
                                    font="Arial 14",
                                    command=janela_principal.destroy)
sair_btn.grid(row=5, column=0, columnspan=2, padx=20, pady=10, sticky="NSEW")

# Centralizar os widgets na janela
for i in range(5):
    janela_principal.grid_rowconfigure(i, weight=1)

for i in range(2):
    janela_principal.grid_columnconfigure(i, weight=1)

# Ajusta o tamanho dos botões para ficarem uniformes
entrar_btn.config(width=10)
sair_btn.config(width=10)

# Inicia a janela na tela
janela_principal.mainloop()
