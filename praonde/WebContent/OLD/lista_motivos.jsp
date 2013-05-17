<%@ page import="java.util.*, Dao.*, Servlets.*" %>
	<html>
	     <body>
	     <%
	     MotivoDAO md = new MotivoDAO();
	     List<Motivo> motivos = md.getLista();
	     %>
		
		<script>
			function confirmExclusao(id) {  
				if (confirm("Tem certeza que deseja excluir esse motivo?")) {  
					location.href="removeMotivo?idMotivo="+id;  
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
		<% if (motivos.isEmpty()){ %>
			<h3> N�o h� produtos cadastrados com essa especifica��o!</h3>
		<% }else for(Motivo m : motivos){ %>
			<tr>
			<td>	
				<%=m.getIdMotivo()%>
			</td>
			<td>
				<%=m.getMotivo()%>
			</td>
			<td>
				<a href=edita_motivo.jsp?idMotivo=<%=m.getIdMotivo()%>>Alterar</a>
			</td>
			<td>
				<a href=javascript:confirmExclusao(<%=m.getIdMotivo()%>)>Remover</a>
			</td>
			</tr>
			<%}%>
			</table>
         </center>          
	     </body>
   </html>
