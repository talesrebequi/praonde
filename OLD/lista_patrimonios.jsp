<%@ page import="java.util.*, Dao.*, Servlets.*" %>
	<html>
	     <body>
	     <%
	     PatrimonioDAO pd = new PatrimonioDAO();
	     List<Patrimonio> patrimonios = pd.getLista();
	     %>
		
		<script>
			function confirmExclusao(id) {  
				if (confirm("Tem certeza que deseja excluir esse patrim�nio?")) {  
					location.href="removePatrimonio?idPatrimonio="+id;  
				}  	
			}  
		</script>		
		<center>
		<table cellspacing="1" cellpadding="1" border="3">
		<tr>
		<td>
			C�digo
		</td>
		<td>
			Descri��o
		</td>
		</tr>
		<% if (patrimonios.isEmpty()){ %>
			<h3> N�o h� patrim�nios cadastrados com essa especifica��o!</h3>
		<% }else for(Patrimonio p : patrimonios){ %>
			<tr>
			<td>	
				<%=p.getIdPatrimonio()%>
			</td>
			<td>
				<%=p.getPatrimonio()%>
			</td>
			<td>
				<a href=edita_patrimonio.jsp?idPatrimonio=<%=p.getIdPatrimonio()%>>Alterar</a>
			</td>
			<td>
				<a href=javascript:confirmExclusao(<%=p.getIdPatrimonio()%>)>Remover</a>
			</td>
			</tr>
			<%}%>
			</table>
            </center>       
	     </body>
   </html>
