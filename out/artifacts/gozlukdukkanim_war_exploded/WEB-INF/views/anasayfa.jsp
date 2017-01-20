<%@include file="template/header.jsp"%>

<div class="banner">
    <div class="container">
        <script src="<c:url value="/resources/js/responsiveslides.min.js"/> "></script>
        <script>
            $(function () {
                $("#slider").responsiveSlides({
                    auto: true,
                    nav: true,
                    speed: 500,
                    namespace: "callbacks",
                    pager: true,
                });
            });
        </script>
        <div id="top" class="callbacks_container">
            <ul class="rslides" id="slider">
                <li>

                    <div class="banner-text">
                        <h3 style="color:red" class="jumbotron alert-info">Lorem Ipsum is not simply dummy </h3>
                        <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of
                            classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a
                            Latin professor .</p>
                        <a href="single.html">Learn More</a>
                    </div>

                </li>
                <li>

                    <div class="banner-text">
                        <h3>There are many variations </h3>
                        <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of
                            classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a
                            Latin professor .</p>
                        <a href="single.html">Learn More</a>

                    </div>

                </li>
                <li>
                    <div class="banner-text">
                        <h3>Sed ut perspiciatis unde omnis</h3>
                        <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of
                            classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a
                            Latin professor .</p>
                        <a href="single.html">Learn More</a>

                    </div>

                </li>
            </ul>
        </div>

    </div>
</div>

<!--content-->
<div class="content">
    <div class="container">
        <div class="content-top">
            <div class="jumbotron" style="background-color: /* Permalink - use to edit and share this gradient: http://colorzilla.com/gradient-editor/#f0b7a1+0,8c3310+50,752201+51,bf6e4e+100;Brown+Gloss */
background: #f0b7a1; /* Old browsers */
background: -moz-linear-gradient(top,  #f0b7a1 0%, #8c3310 50%, #752201 51%, #bf6e4e 100%); /* FF3.6-15 */
background: -webkit-linear-gradient(top,  #f0b7a1 0%,#8c3310 50%,#752201 51%,#bf6e4e 100%); /* Chrome10-25,Safari5.1-6 */
background: linear-gradient(to bottom,  #f0b7a1 0%,#8c3310 50%,#752201 51%,#bf6e4e 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#f0b7a1', endColorstr='#bf6e4e',GradientType=0 ); /* IE6-9 */
">
                <h1 class="page-header">NEW RELEASED</h1>
                <div class="grid-in">
                    <div class="col-md-4 grid-top">
                        <a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive"
                                                                                                src="images/pi.jpg"
                                                                                                alt="">
                            <div class="b-wrapper">
                                <h3 class="b-animate b-from-left    b-delay03 ">
                                    <span>T-Shirt</span>
                                </h3>
                            </div>
                        </a>


                        <p><a href="single.html">Contrary to popular</a></p>
                    </div>
                    <div class="col-md-4 grid-top">
                        <a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive"
                                                                                                src="images/pi1.jpg"
                                                                                                alt="">
                            <div class="b-wrapper">
                                <h3 class="b-animate b-from-left    b-delay03 ">
                                    <span>Shoe</span>
                                </h3>
                            </div>
                        </a>
                        <p><a href="single.html">classical Latin</a></p>
                    </div>
                    <div class="col-md-4 grid-top">
                        <a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive"
                                                                                                src="images/pi2.jpg"
                                                                                                alt="">
                            <div class="b-wrapper">
                                <h3 class="b-animate b-from-left    b-delay03 ">
                                    <span>Bag</span>
                                </h3>
                            </div>
                        </a>
                        <p><a href="single.html">undoubtable</a></p>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="grid-in">
                    <div class="col-md-4 grid-top">
                        <a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive"
                                                                                                src="images/pi3.jpg"
                                                                                                alt="">
                            <div class="b-wrapper">
                                <h3 class="b-animate b-from-left    b-delay03 ">
                                    <span>Shirt</span>
                                </h3>
                            </div>
                        </a>
                        <p><a href="single.html">suffered alteration</a></p>
                    </div>
                    <div class="col-md-4 grid-top">
                        <a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive"
                                                                                                src="images/pi4.jpg"
                                                                                                alt="">
                            <div class="b-wrapper">
                                <h3 class="b-animate b-from-left    b-delay03 ">
                                    <span>Bag</span>
                                </h3>
                            </div>
                        </a>
                        <p><a href="single.html">Content here</a></p>
                    </div>
                    <div class="col-md-4 grid-top">
                        <a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive"
                                                                                                src="images/pi5.jpg"
                                                                                                alt="">
                            <div class="b-wrapper">
                                <h3 class="b-animate b-from-left    b-delay03 ">
                                    <span>Shoe</span>
                                </h3>
                            </div>
                        </a>
                        <p><a href="single.html">readable content</a></p>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>
        <!----->

<%@include file="template/footer.jsp"%>