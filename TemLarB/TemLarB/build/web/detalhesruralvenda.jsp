<!DOCTYPE html>
<!--[if IE 9]><html class="lt-ie10" lang="en" > <![endif]-->


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>


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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/dripicon.css">
       
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

           .imagem{
                background-image: url(img/footer.png);
                height: 550px;
                position: center;
            }

            .imagem2{
                background-image: url(img/footer2.png);
                background-repeat:no-repeat;
                
                position: center;
            }
            
             .imagemsmall{
                background-image: url(img/footer3.png);
               
                position: center;
            }



  .diferente{
                color: #fff;

            }
            h6.textoFooter{
                font-family:  Trebuchet MS;

                color: white;


            }

ul.none {
	list-style-type: none;
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
                    <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a>Voltar</li>
                </ul>
                <section class="top-bar-section">
                    <ul class="center"> 
                        <li><a href="index.html">Página Inicial</a></li>
                        <li><a href="sobre.html">Sobre</a></li>
                        <li class="has-dropdown"><a href="imoveisVenda.jsp">Imóveis a Venda</a>
                            <ul class="dropdown">
                                <li><a href="casasV.html">Casas</a></li>
                                <li><a href="#">Apartamentos</a></li>
                                <li><a href="#">Lotes</a></li>
                                <li><a href="#">Rurais</a></li>
                                <li><a href="#">Comerciais</a></li>


                            </ul>               
                        </li>
                        <li class="has-dropdown"><a href="imoveisAlugar.jsp">Imóveis a alugar</a>
                            <ul class="dropdown">
                                <li><a href="casasA.html">Casas</a></li>
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
  
     
<div class="expanded row" style=" max-width: 95% ">
           <div class="row" >
        <div class="small-12 medium-12 large-12 columns " > 
             </br>
            <ul class="breadcrumbs">
                <li><a href="index.jsp">Página Inicial</a></li>
                         <li class="unavailable"><a href="#">Imóveis a Venda</a></li>
                       <li><a href="ruralvenda.jsp">Rurais</a></li>
                          <li class="unavailable"><a href="#">Detalhes Rural</a></li>
            </ul>
        </div>
           </div>
</div>

 
        
        
        <div class="expanded row" style=" max-width: 95% ">
           <fieldset>
            
            <div class="row" >
  
       <div class="small-12 medium-6 large-6 columns" > 
                
             
     

                        <ul class="example-orbit" data-orbit>
                     <li>
                    
                      <img src="${pageContext.request.contextPath}/img/aluga9.jpg"  alt="slide 1" />
                     <div class="orbit-caption">
                      
                     </div>
                 </li>
              <li class="active">
               <img src="../assets/img/examples/andromeda-orbit.jpg" alt="slide 2" />
              <div class="orbit-caption">
                  
                   </div>
  </li>
  <li>
    <img src="../assets/img/examples/launch-orbit.jpg" alt="slide 3" />
    <div class="orbit-caption">
      
    </div>
  </li>
</ul>

                    </div>

                   
                
       
                
<div class="small-12 medium-6 large-6 columns" > 
        
        
    <h2 style="color:#FFA500 " class="text-center"><b>VENDE - SE</b></h2>  
    <h3 style="color:#FFA500 " class="text-center"><b>RURAL</b></h3>  
    <h6 class="text-center" ${casa.endImovel} > Rua Rio de Janeito </h6>
    <h6  class="text-center" ${casa.bairroImovel}>Bairro Imovel    </h6>
    <h6 class="text-center"   ${casa.cidadeImovel}>  Cidade Imovel  </h6>
    
        
</div>
           
        
    
     
        <div class="small-12 medium-6 large-6 columns " > 
            </br>
           <h5 style="color:#FFA500"  class="text-center"><b>VALOR</b></h5>  
           <h6  ${casa.valorImovel} class="text-center"><b>R$ &nbsp 300,00   </h6></h6>
            
            
            </div>
            </div>
     </div>
                
                   </fieldset>
</div>
           
           
           <div class="expanded row" style=" max-width: 90% ">
             <fieldset>
               <div class="row">
                
                    <div class="small-6 medium-2 large-2  columns " > 
                        <h5 ${casa.numQuarto} class="text-center"><strong > 6</strong></h5>
                        <h5 class="text-center"><font color = "#A9A9A9"> Quartos </font></h5>
                    </div>
                    <div class="small-6 medium-2 large-2   columns " > 
                        <h5  ${casa.numBanheiro} class="text-center"><strong> 3</strong></h5>
                        <h5 class="text-center"><font color = "#A9A9A9"> Banheiro</font></h5>
                    </div>
                    <div class="small-6 medium-2 large-2   columns " > 
                        <h5 ${casa.numSuites} class="text-center"><strong ${casa.valorImovel}> 2</strong></h5>
                        <h5 class="text-center"><font color = "#A9A9A9"> Suites</font></h5>
                    </div>
                    <div class="small-6 medium-2 large-2   columns " > 
                        <h5  ${casa.numCozinhas} class="text-center"><strong>2</strong></h5>
                        <h5 class="text-center"><font color = "#A9A9A9"> Cozinhas</font></h5>
                    </div>
                    <div class="small-6 medium-2 large-2   columns " > 
                        <h5 ${casa.possuiDespejo} class="text-center"><strong> Sim</strong></h5>
                        <h5 class="text-center"><font color = "#A9A9A9"> Despensa</font></h5>
                    </div>
                    <div class="small-6 medium-2 large-2   columns " > 
                        <h5 ${casa.areaImovel} class="text-center"><strong> 200</strong></h5>
                        <h5 class="text-center"><font color = "#A9A9A9"> M²</font></h5>
                    </div>

            </div>

</fieldset>
        </div>
        
            <div class="expanded row" style=" max-width: 93% ">
        
         <div class="row">
                <fieldset>	
                    <div class="small-12 medium-12 large-12  columns " >
                        <h5  ><font color = "#4682B4">Descrisão</font></h5>
                        <p  class="text-justify" ${casa.descricaoImovel}  >
                            Casa ampla próximo a  Prefeitura Municipal com 3 dormitórios, 2 cozinhas, 2 banheiros, copa, sala ampla,  com despensa
                            3 vagas de garagem coberta e 1 sem cobertura,  toda em piso frio em excelente estado, pinturas novas, murada, portão eletrônico.

                        </p>
                    </div>
                </fieldset>
            </div>
        
            </div>
        
        
        
   







<!--footer -->




<div class="expanded row" style=" max-width:100%; margin-bottom: 0px; padding-bottom: 0px; ">
        <div class="row"  >

            <footer >

                <div class="small-12 medium-12 large-12 columns imagem end columns show-for-medium-up"  > 

                    </br> </br> 

                    <div class="medium-1 large-2 columns " > 

                        </br>
                        </br>

                    </div>
                    <div class="medium-3 large-2 columns " > 

                        <h6 ><a href="index.jsp" class="diferente"><b> Página Inicial</b></a></h6>

                        <ul  class="none">

                            <li  > <h6 ><a href="login.jsp" class="diferente"> Acesse sua Conta</a></h6></li>

                            <li > <h6 style="color:white">Cadastre-se</a></h6>
                                <ul type="disc" style="color:white"> 
                                    <li><h6 ><a href="salvarpessoajuridica.jsp" class="diferente"> Cadastro Pessoa Jurídica</a></h6></li>
                                    <li><h6><a href="salvarpessoajuridica.jsp" class="diferente"> Cadastro Pessoa Física</a></h6></li>

                                </ul>
                            <li><a href="planos.jsp" class="diferente"> Conheça Planos</li>
                            <li><a href="index.jsp" class="diferente">Tire Dúvidas</li>
                            <li><a href="index.jsp" class="diferente">Quem Somos</li>
                        </ul>
                        </br></br>
                    </div>



                    <div class="medium-2 large-2 columns" > 
                        <h6 ><a href="imoveisVenda.jsp" class="diferente"><b> Imóveis a Venda</b></a></h6>
                        <ul  align="left" class="none">
                            <li> <h6 ><a href="#" class="diferente"> Casas</a></h6></li>
                            <li> <h6 ><a href="#" class="diferente"> Apartamentos</a></h6></li>
                            <li  > <h6 ><a href="#" class="diferente"> Lotes</a></h6></li>
                            <li  > <h6 ><a href="#" class="diferente"> Rurais</a></h6></li>
                            <li  > <h6 ><a href="#" class="diferente"> Comerciais</a></h6></li>
                        </ul>
                        </br></br>
                    </div>

                    <div class=" medium-2 large-2 columns" > 
                        <h6 ><a href="imoveisAlugar.jsp" class="diferente"><b>Imóveis a Alugar</b></a></h6>
                        <ul  align="left" class="none">
                            <li> <h6 ><a href="#" class="diferente"> Casas</a></h6></li>
                            <li> <h6 ><a href="#" class="diferente"> Apartamentos</a></h6></li>
                            <li  > <h6 ><a href="#" class="diferente"> Cômodos</a></h6></li>
                            <li  > <h6 ><a href="#" class="diferente"> Rurais</a></h6></li>
                            <li  > <h6 ><a href="#" class="diferente"> Comerciais</a></h6></li>
                        </ul>
                        </br></br>
                    </div>
                    <div class="medium-1 large-2 columns " > 

                        <img src="img/logo.png"/>
                    </div>


                    <center>

                        <hr style="width:80%; align:center;">
                    </center>


                    <h6 align="center"   class="textoFooter" >Tem Lar - Todos os direitos reservados. ©2016 - Desenvolvido por Ana Paula e Jéssica Pina</h6>

                </div>



            </footer>
        </div>
    </div>






    <!-- ************************************************ -->
    <script src="js/vendor/jquery.js"></script>
    <script src="js/foundation.min.js"></script>
    <script>
        $(document).foundation();
    </script>
</body>
</html>