import smtplib
from email.message import EmailMessage

# 1. Configurar o corpo do e-mail
corpo_email = """
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Feliz Aniversário</title>
</head>
<body style="font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;">
    <div style="background-color: #ffffff; padding: 20px; border-radius: 8px;">
        <h1 style="color: #4CAF50;">Parabéns, Ana!</h1>
        <p>Feliz Aniversário, Ana! </p>
        <p>Esse é um dia especial, aproveite seu dia!</p>
        <p>Atenciosamente.</p>
        <p><img src="Assinatura_Email.jpeg">.</p>
        <p>Aqui está um <a href="https://www.python.org" style="color: #2196F3;">link para o site oficial</a>.</p>
    </div>
</body>
</html>
"""

# # 1. Configurar os dados do e-mail
email_remetente = "fernandojsmelo@gmail.com"
senha_app = "oioc szdp odib qunk"  # Gerada nas configurações da sua conta Google
email_destinatario = "destinatario@gmail.com"

msg = EmailMessage()
msg["Subject"] = "Feliz Aniversário"
msg["From"] = email_remetente
msg["To"] = email_destinatario
# msg.set_content("Este é o corpo do e-mail enviado automaticamente com Python.")
msg.set_content(corpo_email, subtype="html")

# 2. Conectar com o servidor do Gmail (SMTP) e enviar
try:
    with smtplib.SMTP_SSL("smtp.gmail.com", 465) as servidor:
        servidor.login(email_remetente, senha_app)
        servidor.send_message(msg)
    print("E-mail enviado com sucesso!")
except Exception as e:
    print(f"Erro ao enviar o e-mail: {e}")

# import win32com.client as win32
#
# outlook = win32.Dispatch("outlook.application")
#
# emailOutlook = outlook.CreateItem(0)
#
# emailOutlook.To = "ana@gmail.com"
# emailOutlook.Subject = "Feliz Aniversário"
# emailOutlook.HTMLBody = """
# <p>Parabéns, Ana!</p>
# <p>Esse é um dia especial, aproveite seu dia!</p>
# <p>Atenciosamente.</p>
# """
#
# #save - Salvar como rascunho / draft
# #send - envia
# emailOutlook.save()