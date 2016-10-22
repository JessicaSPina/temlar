<!DOCTYPE html>
<!--[if IE 9]><html class="lt-ie10" lang="en" > <![endif]-->
<html class="no-js" lang="pt-br" >

    <head>
        <meta charset="utf-8">
        <!-- If you delete this meta tag World War Z will become a reality -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Tem Lar</title>
        <!-- If you are using the CSS version, only link these 2 files, you may add app.css to use for your overrides if you like -->
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/foundation.css">
        <link rel="stylesheet" href="css/foundation.min.css" type="text/css"/>




        <style type="text/css">

            .azul{

                background-color:  #4682B4;

            }
            .yellow{

                background-color: yellow;

            }

            video {
                margin: 0;
                padding: 0;
                width: 100%;
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


    <div class="small-12 medium-3 large-3 columns " > 
        <img src="img/logo.png"  width="250px"  height="20px" />

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


</head>
<body>   


    <!-- Código HTML aqui.... -->

    <!--declarando a navbar-->

    </br>

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
        </br>

        <div class="small-12 medium-12 large-12 columns " > 
            <ul class="breadcrumbs">
                <li><a href="index.jsp">Página Inicial</a></li>

            </ul>
        </div>


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
                    <a href="https://www.facebook.com/imobiliariasantaalbertina/?fref=ts" target="about_blank"><img src="img/facebook.png" width="60px" height="60px" /></a>
                    <!--<a href="http://www.imobiliariasantaalbertina.amawebs.com/" target="about_blank"><img src="img/imobiliaria.jpg" width="40px" height="30px" /></a>-->
                    </br>
                    </br>
                </div>
                <h6 align="center"   class="textoFooter" >Tem Lar - Todos os direitos reservados. ©2016 - Desenvolvido por Ana Paula e Jéssica Pina</h6>
            </div>



        </footer>







        <!-- ************************************************ -->
        <script src="js/vendor/jquery.js"></script>
        <script src="js/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script>
</body>
</html>