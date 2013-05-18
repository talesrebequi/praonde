<%@ page import="java.util.*, Dao.*, Servlets.*" %>
	<html>
	     <body>
	     <%
	     Condicao_PagamentoDAO cd = new Condicao_PagamentoDAO();
	     List<Condicao_Pagamento> cps = cd.getLista();
	     %>
		
		<script>
			function confirmExclusao(id) {  
				if (confirm("Tem certeza que deseja excluir essa condi��o de pagamento?")) {  
					location.href="removeCondicao_Pagamento?idCondicao_Pagamento="+id;  
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
		<% if (cps.isEmpty()){ %>
			<h3> N�o h� condi��es de pagamento cadastradas com essa especifica��o!</h3>
		<% }else for(Condicao_Pagamento cp : cps){ %>
			<tr>
			<td>	
				<%=cp.getIdCondicao_Pagamento()%>
			</td>
			<td>
				<%=cp.getCondicao_pagamento()%>
			</td>
			<td>
				<a href=edita_condicao_pagamento.jsp?idCondicao_Pagamento=<%=cp.getIdCondicao_Pagamento()%>>Alterar</a>
			</td>
			<td>
				<a href=javascript:confirmExclusao(<%=cp.getIdCondicao_Pagamento()%>)>Remover</a>
			</td>
			</tr>
			<%}%>
			</table>
         </center>          
	     </body>
   </html>
