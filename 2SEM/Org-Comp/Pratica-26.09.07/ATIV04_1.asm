TITLE ATIV04
.MODEL SMALL
.STACK 100h
.DATA
    ASTERISCO DB 10,13,"*$"
.CODE
MAIN PROC
    MOV AX,@DATA
    MOV DS,AX

    ; deixa o contador cx equivalente a 50
    MOV CX,50d

    REPETICAO:

        ; imprime o asterisco na tela
        MOV AH,9
        MOV DX,OFFSET ASTERISCO
        INT 21h

        ; decrementa CX 
        DEC CX
        JNZ REPETICAO

    MOV AH,4Ch
    INT 21h
MAIN ENDP
END MAIN