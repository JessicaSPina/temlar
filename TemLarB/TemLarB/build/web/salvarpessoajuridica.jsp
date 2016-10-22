<!DOCTYPE html>
<!--[if IE 9]><html class="lt-ie10" lang="en" > <![endif]-->
<html class="no-js" lang="pt-br" >

    <head>
        <meta charset="ISO-8859-1"/>
        <!-- If you delete this meta tag World War Z will become a reality -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>Tem Lar</title>
        <!-- If you are using the CSS version, only link these 2 files, you may add app.css to use for your overrides if you like -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/foundation.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/foundation.min.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/adm/css/dripicon.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/adm/css/typicons.css" />




        <style type="text/css">

            .azul{

                background-color:  #4682B4;

            }
            .yellow{

                background-color: yellow;

            }

            

            h4.right{
                font-family:  Trebuchet MS;
                font-size:  1.5em;
                color: #4682B4;

            }

            h6.left{
                font-family:  Trebuchet MS;

                color: #fff;

            }
            .diferente{
                color: #fff;

            }
            h6.textoFooter{
                font-family:  Trebuchet MS;

                color: white;


            }




        </style>

    </head>
  
        
        
       <div class="expanded row" style=" max-width: 97% ">
           <div class="row" >
    <div class="small-12 medium-3 large-3 columns " > 
        <img src="${pageContext.request.contextPath}/img/logo.png"  width="250px"  height="20px" />

    </div>


    <div class="medium-2 columns">
        </br>
        <label>Onde ?
            <select id="select" required>

                <option value="volvo">Andradina</option>
                <option value="saab">Jales</option>
                <option value="mercedes">Santa Albertina</option>
                <option value="audi">Santa Fé do Sul</option>
            </select>
        </label>
    </div>

    <div class="medium-2 columns">
        </br>
        <label>Qual Negociação ?
            <select id="select" required>

                <option value="volvo">Alugar</option>
                <option value="saab">Comprar</option>
                <option value="volvo">Temporada</option>

            </select>
        </label>
    </div>

    <div class="medium-2 columns">
        </br>

        <label>Qual Tipo?
            <select id="select" required>

                <option value="volvo">Apartamento</option>
                <option value="saab">Casa</option>
                <option value="volvo">Cômodo</option>
                <option value="saab">Lotes</option>
                <option value="volvo">Rural</option>
                <option value="saab">Comercial</option>


            </select>
        </label>
    </div>

        </div>
       </div>
    
    <!--<h4 href="#" class="right"  > <strong>&nbsp; você busca esta aqui ! </strong>  </h4>
    <h4 href="#" class="right"  > <strong> O que  </strong> </h4>
    -->



    <!--<input type="text"  placeholder="Buscar.."> -->


    <!--<div class="small-6 medium-2 large-2 end columns show-for-medium-up"> 
    </br>
            <a href="#" type="search" class="button postfix">Buscar</a> 
    </div> 
            <div class="small-6 end columns show-for-small-only"> 
    
            <a href="#" type="search" class="button postfix">Buscar</a> 
    </div> 
    -->






    <!-- Código HTML aqui.... -->

    <!--declarando a navbar-->

    </br>
 <div class="expanded row" style=" max-width: 100% ">
           <div class="row" >
    <div class="small-12 medium-12 large-12  columns " > 
        <nav class="top-bar" data-topbar>
            <ul class="title-area">
                <li class="name">
                    <h1><a href="#"></a></h1>
                </li>
                <!--barra de navegação para telas pequenas -->
                <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
            </ul>
            <section class="top-bar-section">
                <ul class="center"> 
                    <li><a href="index.jsp">Página Inicial</a></li>
                    <li><a href="sobre.jsp">Sobre</a></li>
                    <li class="has-dropdown"><a href="imoveisVenda.jsp">Imóveis a Venda</a>
                        <ul class="dropdown">
                            <li><a href="casasV.jsp">Casas</a></li>
                            <li><a href="#">Apartamentos</a></li>
                            <li><a href="#">Lotes</a></li>
                            <li><a href="#">Rurais</a></li>
                            <li><a href="#">Comerciais</a></li>


                        </ul>               
                    </li>
                    <li class="has-dropdown"><a href="imoveisAlugar.jsp">Imóveis a alugar</a>
                        <ul class="dropdown">
                            <li><a href="casasA.jsp">Casas</a></li>
                            <li><a href="#">Apartamentos</a></li>
                            <li><a href="#">Cômodos</a></li>
                            <li><a href="#">Rurais</a></li>
                            <li><a href="#">Comerciais</a></li>

                        </ul>               
                    </li>
                    <li><a href="faleConosco.jsp"> Contato</a></li>

                </ul>
            </section>


        </nav> 
    </div></div></div> 
        </br>

        <div class="expanded row" style=" max-width:95% ">
           <div class="row" >
        <div class="small-12 medium-12 large-12 columns " > 
            <ul class="breadcrumbs">
                <li><a href="index.jsp">Página Inicial</a></li>

                <li class="unavailable"><a href="salvarpessoajuridica.jsp">Cadastro Pessoa Jurídica</a></li>
            </ul>
        </div>
           </div>
        </div>


       <div class="expanded row" style=" max-width:95% ">
           <div class="row" >
                     
        <div class="small-12 medium-3 large-3 columns end show-for-small-only  ">
             </br>   </br> 


             <a href="login.jsp"  title="Acesse sua Conta"> <img src="${pageContext.request.contextPath}/img/minhaconta.png" style=" padding: 0 3px 0 2px;"/> </a>
             
             
             <a href="#"  data-dropdown="hover1" data-options="is_hover:true"><img src="${pageContext.request.contextPath}/img/cadastrar.png" style=" padding: 0 3px 0 2px;"/> </a>
            <ul id="hover1" class="f-dropdown" data-dropdown-content>
                <li><a href="salvarpessoajuridica.jsp">Pessoa Jurídica</a></li>
                <li><a href="salvarpessoafisica.jsp">Pessoa Física</a></li>

            </ul>

          <a href="planos.jsp"  title="Conheça Planos"> <img src="${pageContext.request.contextPath}/img/planos.png" style=" padding: 0 3px 0 2px;"/> </a>
            <!--<a href="cadastro.jsp" class="button disabled">&nbsp&nbspCrie sua conta &nbsp&nbsp</a>-->
          <a href="tireduvidas.jsp"  title="Tire Dúvidas"> <img src="${pageContext.request.contextPath}/img/duvidas.png" style=" padding: 0 3px 0 2px;"/> </a>
            <a href="sobre.jsp"  title="Quem Somos"> <img src="${pageContext.request.contextPath}/img/sobre.png" style=" padding: 0 3px 0 2px;"/> </a>
             </br>   </br>   </br>
        </div>

             
             

        <div class="small-12 medium-9 large-9 columns" >

            <h2> ${sucesso}</h2>

            <form data-abide name="salvar" action="<%=request.getContextPath()%>/SalvarPessoaJuridica" method="get">
                <fieldset>
                    <legend><h4> Cadastro de Pessoa Jurídica</h4></legend>

                    <div class="id-field">

                        <input type="hidden" name="idjuridica" value="${pessoajuridica.idJuridica}" readonly="readonly" /></br></br>

                    </div>

                    <div class="small-12 medium-7 large-7 columns" >

                        <div class="name-field">

                            <label>Nome <small>required</small>
                                <input type="text" name="nomepessoa" size="70px" value="${pessoa.nomePessoa}" required />
                            </label>
                            <small class="error">Digite o Nome</small>
                        </div>
                    </div>

                    <div class="small-12 medium-5 large-5 columns" >

                        <div class="cnpj-field">

                            <label>CNPJ <small>required</small>
                                <input type="text" name="cnpj" value="${pessoajuridica.cnpjjuridica}" required pattern="[0-9]{2}\.?[0-9]{3}\.?[0-9]{3}\/?[0-9]{4}\-?[0-9]{2}"/>
                            </label>
                            <small class="error">Digite o CNPJ</small>
                        </div>
                    </div>


                    <div class="small-12 medium-4 large-4 columns" >
                        <div class="ie-field">

                            <label>IE <small>required</small>
                                <input type="text" name="ie" value="${pessoajuridica.iejuridica}" required />
                            </label>
                            <small class="error">Digite o IE</small>
                        </div>
                    </div>
                    <div class="small-12 medium-4 large-4 columns" >
                        <div class="im-field">
                            <label>IM <small>required</small>
                                <input type="text" name="im" value="${pessoajuridica.imjuridica}" required  placeholder="" />
                            </label>
                            <small class="error">Digite o IM</small>
                        </div>
                    </div>
                    <div class="small-12 medium-4 large-4 columns" >
                        <div class="im-field">
                            <label>Creci <small>facultativo</small>
                                <input type="text" name="crecipessoa" value="${pessoa.creciPessoa}" required  placeholder="" />
                            </label>
                            
                        </div>
                    </div>

                    <div class="small-12 medium-6 large-6 columns" >	
                        <div class="telefone-field">
                            <label>Telefone <small>required</small>
                                <input type="text" name="telefonepessoa" value="${pessoa.telefonepessoa}" required />
                            </label>
                            <small class="error">Digite o Telefone</small>
                        </div>
                    </div>			   

                    <div class="small-12 medium-6 large-6  columns" >
                        <div class="email-field">
                            <label>Email <small>required</small>
                                <input type="text" name="emailpessoa" value="${pessoa.emailpessoa}" required  placeholder="exemplo@exemplo.com" />
                            </label>
                            <small class="error">Digite o Email</small>
                        </div>
                    </div>


                    <div class="small-12 medium-4 large-4 columns" >				
                        <div class="cep-field">
                            <label>CEP <small>required</small>
                                <input name="ceppessoa" type="text" id="ceppessoa" value="" size="10" maxlength="9" pattern= "\d{5}-?\d{3}"/>

                            </label>
                            <small class="error">Digite o CEP</small>
                        </div>

                    </div>				   

                     <div class="small-6 medium-3 large-3 columns" >	
                         </br>
                      <a name="buscarCepJson"    onclick="BuscarCEP('json');">  <img src="img/lupa.png"/> </a>
                            </div>
                            
                            
                            
                    <div class="small-12 medium-4 large-5 columns" >	
                        <div class="senha-field">
                            <label>Cidade <small>required</small>
                                <input name="cidadepessoa" type="text" id="cidadepessoa" size="40"/></label><br/>

                            <small class="error">Digite a Senha</small>
                        </div>
                    </div>

                    <div class="small-12 medium-4 large-2 columns" >	        
                        <div class="iduf-field">
                            <label>UF <small>required</small>
                                <input name="ufpessoa" type="text" id="ufpessoa" size="2"/>
                            </label>
                        </div>
                    </div>
                    <div class="small-12 medium-4 large-6 columns" >

                        
                        <div class="endereco-field">
                            <label>Endereço<small>required</small>
                                <input type="text" name="endpessoa" id="endpessoa" value="" required   />


                            </label>
                            <small class="error">Digite o Endereço</small>
                        </div>
                    </div>			   
                       
                            
                             <div class="small-12 medium-5 large-4 columns" >
                        <div class="numero-field">
                            <label>Número <small>required</small>
                                <input type="text" name="numeropessoa" id="numeropessoa" value="" required   />

                            </label>
                            <small class="error">Digite o Número</small>
                        </div>
                    </div>    
                            
                    <div class="small-12 medium-5 large-4 columns" >
                        <div class="bairro-field">
                            <label>Bairro <small>required</small>
                                <input type="text" name="bairropessoa" id="bairropessoa" value="" required   />

                            </label>
                            <small class="error">Digite o Bairro</small>
                        </div>
                           
                     
                    </div>	
                            
                            
                           <div class="small-12 medium-12 large-12 columns" >
                       
                           
                     
                    </div>                  
                            
                    <div class="small-12 medium-4 large-6 columns" >	
                       
                      
                        <div class="login-field">
                            <label>Login <small>required</small>
                                <input type="text" name="loginpessoa" value="${pessoa.loginpessoa}" required placeholder="" />
                            </label>
                            <small class="error">Digite o Login</small>
                        </div>
                    </div>

                    <div class="small-12 medium-4 large-6 columns" >	
                        
                        <div class="senha-field">
                            <label>Senha <small>required</small>
                                <input type="password" name="senhapessoa" value="${pessoa.senhapessoa}" required placeholder="" />
                            </label>
                            <small class="error">Digite a Senha</small>
                        </div>
                    </div>
                            <div class="small-12 medium-4 large-12 columns " >
                   
                                <div class="id-field" >

                        <input type="hidden" name="idpessoa" value="${pessoa.idPessoa}" readonly="readonly" /></br></br>

                    </div>
                            </div>

                    <div class="small-12 medium-4 large-3 columns " >
                        <button type="submit"  value="Salvar" name="cadastrar">Enviar</button>
                    </div>
                        <div class="small-12 medium-4 large-3 columns " >
                        <button type="submit" value="Salvar" name="cadastrar" style="align: left;">Limpar</button>
                    </div>
<div class="small-6 medium-6 large-6 columns " >
    </br>
                    </div>

                </fieldset>
            </form>

        </div>


  <div class="small-12 medium-3 large-3 columns  " > 
                                   
                                                 </br>
                                                 
                                                 </br></br></br></br>
                               </div>
                        
                       
      
         
       <div class="small-12 medium-3 large-3 columns end show-for-medium-only  ">

           
             <div class="small-6 medium-6 large-12 columns ">
             <a href="login.jsp"  title="Acesse sua Conta"> <img src="${pageContext.request.contextPath}/img/minhaconta.png" style=" padding: 1px;"/> </a>
             </div>
             <div class="small-2 medium-6 large-12 columns ">
             <a href="#"  data-dropdown="hover3" data-options="is_hover:true"><img src="${pageContext.request.contextPath}/img/cadastrar.png" style=" padding: 1px;"/> </a>
            <ul id="hover3" class="f-dropdown" data-dropdown-content>
                <li><a href="salvarpessoajuridica.jsp">Pessoa Jurídica</a></li>
                <li><a href="salvarpessoafisica.jsp">Pessoa Física</a></li>

            </ul>
           
             </div>
            
            
           <div class="small-2 medium-6 large-12 columns ">
               </br>
          <a href="planos.jsp"  title="Conheça Planos"> <img src="${pageContext.request.contextPath}/img/planos.png" style=" padding: 1px;"/> </a>
            <!--<a href="cadastro.jsp" class="button disabled">&nbsp&nbspCrie sua conta &nbsp&nbsp</a>-->
           </div>
            
            
            <div class="small-2 medium-6 large-12 columns ">
                    </br>
            <a href="tireduvidas.jsp"  title="Tire Dúvidas"> <img src="${pageContext.request.contextPath}/img/duvidas.png" style=" padding: 1px;"/> </a>
            </div>
            
            
           <div class="small-2 medium-6 large-12 columns ">
                   </br>
            <a href="sobre.jsp"  title="Quem Somos"> <img src="${pageContext.request.contextPath}/img/sobre.png" style=" padding: 1px;"/> </a>
           
       </div>
        </div>
       
          
                     
        <div class="small-12 medium-3 large-3 columns end show-for-large-up  ">

             <center>
            <a href="login.jsp"class="button expand">Acesse sua conta</a>

            <a href="#" class="alert expand button" data-dropdown="hover2" data-options="is_hover:true">Cadastre-se</a><br>
            <ul id="hover2" class="f-dropdown" data-dropdown-content>
                <li><a href="salvarpessoajuridica.jsp">Pessoa Jurídica</a></li>
                <li><a href="salvarpessoafisica.jsp">Pessoa Física</a></li>

            </ul>


            <!--<a href="cadastro.jsp" class="button disabled">&nbsp&nbspCrie sua conta &nbsp&nbsp</a>-->
            <a href="planos.jsp"class="button expand">Conheça Planos</a>
            <a href="#" class="alert expand button">Tire dúvidas</a>
            <a href="#"class="button expand">Quem Somos</a>
              </center>
        </div>
       
           </div>
       </div>
            
            
            

<div class="expanded row" style=" max-width:100% ">
           <div class="row" >
        <footer >

            <div class="small-12 medium-12 large-12 columns azul panel   end columns show-for-medium-up" > 



                <div class="small-12 medium-3 large-3 columns " > 
                    <h6 ><a href="index.jsp" class="diferente"> Página Inicial</a></h6>
                    <ul  align="left">
                        <li > Destaques</li>
                        <li > Dúvidas</li>
                    </ul>
                </div>



                <div class="small-12 medium-3 large-3 columns" > 
                    <h6 ><a href="imoveisVenda.jsp" class="diferente"> Imóveis a Venda</a></h6>
                    <ul  align="left">
                        <li > Casas</li>
                        <li > Sítios</li>
                        <li > Ranchos</li>
                    </ul>
                </div>

                <div class="small-12 medium-3 large-3 columns" > 
                    <h6 ><a href="imoveisAlugar.jsp" class="diferente"> Imóveis a Alugar</a></h6>
                    <ul  align="left">
                        <li > Casas</li>
                        <li > Sítios</li>
                        <li > Ranchos</li>
                    </ul>
                </div>
                <div class="small-12 medium-3 large-3 columns" > 
                    <h6 ><a href="faleConosco.jsp" class="diferente"> Contato</a></h6>
                    <ul  align="left">
                        <li >Fale Conosco</li>

                    </ul>
                    <!--<a href="https://www.facebook.com/imobiliariasantaalbertina/?fref=ts" target="about_blank"><img src="img/facebook.png" width="60px" height="60px" /></a>-->
                    <!--<a href="http://www.imobiliariasantaalbertina.amawebs.com/" target="about_blank"><img src="img/imobiliaria.jpg" width="40px" height="30px" /></a>-->
                    </br>
                    </br>
                </div>
                <h6 align="center"   class="textoFooter" >Tem Lar - Todos os direitos reservados. ©2016 - Desenvolvido por Ana Paula e Jéssica Pina</h6>
            </div>

    </div>

</footer>

           </div>
</div>




<!-- ************************************************ -->
<script src="js/vendor/jquery-3.1.0.js"></script>
<script src="js/foundation.min.js"></script>
 <script>
    $(document).foundation();
</script>
<script type="text/javascript">
                        function BuscarCEP(tipo) {
//Nova variável "cep" somente com dígitos.

                            var cep = $('#ceppessoa').val().replace(/\D/g, '');

                            //Verifica se o campo cep possui valor informado
                            if (cep != "") {
                                //Expressão regular para validar o cep.
                                var validacep = /^[0-9]{8}$/;

                                //valida o formato do cep
                                if (validacep.test(cep)) {
                                    if (tipo == 'json')
                                        BuscarCepJSON(cep);
                                    else
                                        BuscarCepXML(cep);
                                }
                            }
                        }

                        function limpa_formulário_cep() {
                            //limpa valores do formulário de cep
                            $("#endpessoa").val("");

                            $("#bairropessoa").val("");
                            $("#cidadepessoa").val("");
                            $("#ufpessoa").val("");
                        }

                        function BuscarCepJSON(cep) {
                            //preencher os campos com ... enquanto consulta web service.
                            $("#endpessoa").val("...");

                            $("#bairropessoa").val("...");
                            $("#cidadepessoa").val("...");
                            $("#ufpessoa").val("...");

                            $.getJSON({
                                url: "https://viacep.com.br/ws/" + cep + "/json/",
                                context: document.body,
                                type: "GET",
                                success: function (dados) {
                                    if (!("erro" in dados)) {
                                        //atualiza os campos com os valores da consulta.
                                        $("#endpessoa").val(dados.logradouro);

                                        $("#bairropessoa").val(dados.bairro);
                                        $("#cidadepessoa").val(dados.localidade);
                                        $("#ufpessoa").val(dados.uf);
                                    }//end if.
                                    else {
                                        //CEP pesquisado não foi encontrado
                                        limpa_formulário_cep();
                                        alert("CEP não encontrado.");
                                    }
                                },
                                error: function (xhr, textStatus, error) {
                                    console.log(xhr.responseText);
                                    console.log(textStatus);
                                    console.log(error);
                                }
                            });
                        }
                        ;

                        function BuscarCepXML(cep) {

                            //preencher os campos com "..." enquanto consulta webservice.
                            $("#endpessoa").val("...");

                            $("#bairropessoa").val("...");
                            $("#cidadepessoa").val("...");
                            $("#ufpessoa").val("...");

                            $.getJSON({
                                url: "https://viacep.com.br/ws/" + cep + "/xml/",
                                context: document.body,
                                type: "GET",
                                dataType: "xml",
                                success: function (dadosxml) {
                                    if (!($(dadosxml).find('erro').text())) {
                                        //atualizaos campos com os valores da consulta
                                        $("#endpessoa").val($(dadosxml).find('logradouro').text());

                                        $("#bairropessoa").val($(dadosxml).find('bairro').text());
                                        $("#cidadepessoa").val($(dadosxml).find('localidade').text());
                                        $("#ufpessoa").val($(dadosxml).find('uf').text());
                                    }//end if
                                    else {//CEP pesquisado não foi encontrado
                                        limpa_formulário_cep();
                                        alert("CEP não encontrado.");
                                    }
                                },
                                error: function (xhr, textStatus, error) {
                                    console.log(xhr.responseText);
                                    console.log(textStatus);
                                    console.log(error);
                                }
                            });
                        }
                        ;
</script>


</body>
</html>