from docx import Document
from docx.shared import Pt

#Abre o arquivo do word
arquivoWord = Document("/home/fernandomelo/Cuso logica Progamação/Curso-Logica-Programacao-/Python/Word/Certificado1.docx")

#Seleciona o estilo
estilo = arquivoWord.styles["Normal"]

#for = para
for paragrafo in arquivoWord.paragraphs:
    #if = se
    if "@nome" in paragrafo.text:
        paragrafo.text = "Berenice Rosa Santos"
        fonte = estilo.font
        fonte.name = "Calibri (Corpo)"
        fonte.size = Pt(24)

#Salvando o certificado do aluno
arquivoWord.save("Berenice Rosa Santos.docx")