# Parcial segundo corte Nicolás Prieto Vargas

## Se mostrará el paso a paso de lo que se hizo para la elaboración de este parcial, junto con capturas para mejor entendimiento.

Lo primero que se hizo fue crear el Proyecto del proxy con ayuda del inicializador de spring y crear el github.
Este gihub contiene dos carpetas, una llamada proxy donde se encontrará toda la lógica del proxy y el formulario del Proyecto y otra llamada MathProblem que contiene la solución del ejercicio de Lucas.
Seguido de esto, vamos a cuadrar el formulario para que quede acorde al ejercicio, en este caso debe ingresar el la cantidad de ítems que dese aver, por ejemplo al poner el 13 debe mostrar la lista que contiene esa cantidad de datos en la lista de Lucas, serían 14 datos teniendo en cuenta que el primer índice es el 0, quedando así:

<img width="975" height="248" alt="image" src="https://github.com/user-attachments/assets/1280d06c-3212-4250-b148-4476069b4231" />

Creamos las tres instancias, una para el proxy y dos para los math services.

<img width="975" height="183" alt="image" src="https://github.com/user-attachments/assets/df28ec6e-32c8-4243-8cf1-8278b04ca4e8" />

Esto dado que en las dos instancias de Math Services debemos subir el mismo programa y en la instancia del proxy debemos subir el programa que delega que una petición se vaya a una instancia de Math service y la siguiente se vaya a la otra, ahora para mayor comodidad vamos a asignar IP elásticas a las math services, para poder ejecutar el programa después y que no toque cambiar la IP en el Código.

<img width="975" height="102" alt="image" src="https://github.com/user-attachments/assets/1eba59ee-a2f6-4f2a-84d6-64db8dda9d6a" />

Ahora en la parte del proxy donde se mandan las IP, enlazamos las IP que acabamos de configurar.

Para cada instancia creada, debemos instalar maven, al instalarlo, de una vez se instala java.

<img width="975" height="309" alt="image" src="https://github.com/user-attachments/assets/39d26931-4d83-49d1-a96c-01c5b669465e" />

Para conectarnos a cada instancia y subir el .jar, Podemos hacerlo mediante WinSCP pero se necesita las llaves en formato .ppk y se haría de la siguiente manera.

<img width="963" height="409" alt="image" src="https://github.com/user-attachments/assets/9c05f675-ff32-460e-ab45-7e87f82a9e15" />

En Host name ponemos la IP de nuestra instancia, y en user name ponemos el nombre que nos da aws (usualmente es ec2-user), ahora damos click en Advanced y luego en Authentication

<img width="850" height="144" alt="image" src="https://github.com/user-attachments/assets/658dc11f-c4e1-462c-87d6-ea009a9bb257" />

En Private key file subimos el ppk de nuestra instancia y damos click en login, acto seguido se nos dejará pasar desde nuestra máquina windows, el archive .jar generado de nuestra aplicación.

Para el correcto funcionamiento de nuestra aplicación y teniendo en cuenta que usamos el Puerto 8080, debemos abrirlo para las instancias.

<img width="975" height="128" alt="image" src="https://github.com/user-attachments/assets/d736b39e-76f9-4e42-bd52-065a6b43f094" />

Una vez tenemos el ejercicio matemático, hacemos el package para verificar que todo esté bien y se genere el .jar, en este caso ya lo temenos.

<img width="975" height="566" alt="image" src="https://github.com/user-attachments/assets/13af4a27-9ca8-47dd-a969-4edd5c158fc0" />

Ahora debemos subirlo a la instancia como se mostró anteriormente.

Ahora en la instancia Podemos ver el .jar

<img width="750" alt="image" src="https://github.com/user-attachments/assets/0ee0d970-6223-459b-aba0-272ea8bd3635" />

Hacemos lo mismo para la otra instancia de Math Service

<img width="750" alt="image" src="https://github.com/user-attachments/assets/abeab4e9-54e0-4175-8519-0ccb223372e9" />

## Lo que se logró:
- Solucionar el ejercicio matemático
- Crear las instancias de manera correcta y sin errores
- Subir el .jar del ejercicio matemático a las instancias correspondientes.
- Asignar IPs estáticas para evitar tener que cambiar después las IP en el código
- Conectar el proxy con las instancias de Math Service
## Lo que no se logró:
- Conectar el front con el back
