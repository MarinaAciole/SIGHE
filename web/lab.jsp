<%-- 
    Document   : lab
    Created on : 02/02/2015, 20:05:12
    Author     : Wisley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <link rel="shortcut icon" href="imagens/ico.png"/>
		<title> RESERVAR LABORATÓRIO </title>
	<style type="text/css">

	body{

background-image: url(imagens/bg.gif);
background-repeat: repeat;
margin-top: 90px;
margin-left:70px;
margin-right:70px;
margin-bottom:80px;
border-bottom: 35px solid green;
border-left: 35px solid green;
border-right: 35px solid green;
border-top: 35px solid green;

}  

 #rodape {	height: 260%;
            }
	
.imagem1{
	position: absolute;
	top: 60%;
	left: 15%;
	
}


.imagem2{
	position: absolute;
	left: 55%;
	top: 60%;
}


.imagem3{
	position: absolute;
	left: 55%;
	top: 140%;
}


.imagem4{
	position: absolute;
	top: 140%;
	left: 15%;
}

.imagem5{
	position: absolute;
	top: 225%;
	left: 70%;
	
}
	

	
	#cabecalho {
	top: 10px;
	margin-left: 127px;
	width: 1347px;
	height: 198px;	
	background-repeat: no-repeat;
	background-position: fixed;
	
	}		
 </style>
	

	<link rel="stylesheet" href="styles.css">
<div id='cssmenu'>
<img  width="100%" src="imagens/newbanner.png" class=""/> </p>
<ul>
   <li class='active'><a href='#'>Home</a></li>
   <li><a href='#'> Sobre </a></li>
   <li><a href='#'> Contato </a></li>
   <li><a href='#'> Ajuda </a></li>
</ul>
</div>

<h2 align="center"> Reserva de Laboratórios </h2>
		<table border="1" align="center">
		<tr>
			<td> Laboratório de Manutenção de Computadores</td>
		</tr>
			<tr>
			<td> Laboratório de Redes de Computadores </td>
		</tr>	
		<tr>
			<td> Laboratório de Línguas </td>
		</tr>
		<tr>
			<td> Laboratório de Biologia </td>
		</tr>
		<tr>
			<td> Laboratório de Informática I </td>
		</tr>
		<tr>
			<td> Laboratório de Informática II </td>
		</tr>
		<tr>
			<td> Laboratório de Informática III </td>
		</tr>
</table>
			<br>	
				<form>
					<fieldset>
					<legend> Preencha o formulário abaixo</legend>
						
						<label> Nome: </label>
						<input type="text" name="nome" required placeholder="Digite seu nome">	
						
						<label> Sobrenome: </label>
						<input type="text" name="sobrenome" required placeholder="Digite seu sobrenome">	<br> <br>
						
						<label> Matrícula: </label>
						<input type="text" name="matricula" required placeholder="Digite sua matrícula">	
						<br><br>
						
						<label> Sexo: </label><br>
						<input type="radio" name="sexo" value="Masculino">Masculino<br>
						<input type="radio" name="sexo" value="Feminino">Feminino<br>
						
						<br>
						
						Horário: De <input type="text" name="inicio" required placeholder="Hora de início"> às <input type="text" name="termino" required placeholder="Hora de término"> *Máx. de 1h!
						<br>
						<br>
						<label> Laboratório desejado: </label>
						<select name="lab">
							<option>Manutenção</option>
							<option>Redes</option>
							<option>Biologia</option>
							<option>Línguas</option>
							<option>Informática I</option>
							<option>Informática II</option>
							<option>Informática III</option>
							</select>
						<br>
						<br>
						
						<button type="submit"> Reservar Laboratório </button>
						<button type="reset"> Limpar campos</button>
						
						</fieldset>
					</form>
				</td>
				
			</tr>

			<tr>

</form>
		<h4 align="center"> Comprovante de reserva: </h4>
		<table border="1" align="center">
		<tr>
			<td> Reserva do Laboratório de Manutenção
			<br>Aluno: Thomas Matheus Lopes (20101064010370)
			<br> De 17h00 às 18h00
			<br> Obs: Apresentar comprovante no COLAB para pegar a chave!</td>
		</tr>
			</table>
			<center> <button type="submit"> Imprimir </button>

 
<div id="body">
</div>
<div id="cabecalho">
</div>
<div id="rodape">
<div>
</head>
</body>
</html>
