# Escribir en el archivo
archivo = open(r"C:\Users\ED LAPTOP\Desktop\Estudios\CUARTO SEMESTRE\BASE_DE_DATOS_I\PRIMER_PARCIAL\crearDATOSPRUEBA.txt", "w")
archivo.write("Te amo Edmundo \n")
archivo.close()

# Leer el contenido del archivo
archivo = open(r"C:\Users\ED LAPTOP\Desktop\Estudios\CUARTO SEMESTRE\BASE_DE_DATOS_I\PRIMER_PARCIAL\crearDATOSPRUEBA.txt", "r")
contenido = archivo.read()
print(contenido)
archivo.close()

#Hola comentario xd