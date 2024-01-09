<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <style>
        .big{
            display: flex;
            /* border: 1px solid red; */
            width: 500px;
            margin: auto;
        }
        .box{
            border: 1px solid black;
            width: 100px;
            height: 100px;
            margin-left: 20px;
        }
        #box1{

            text-align: center;

        }
    </style>
</head>
<body>
    <div class="big">
        <div id="box1" class="box" >
            <p id="p1">Welcome</p>
        </div>
        <div id="box2" class="box">
            
        </div>
        <div id="box3" class="box">
            
        </div>
        <div id="box4" class="box">
            
        </div>

    </div>
    

    <script>

        //Box--1
        var box1=document.getElementById("box1");
        var p1=document.getElementById("p1");

        box1.addEventListener("click",()=>{
            p1.innerText="Hii Mam";
            p1.style.color="red";
        });

        //Box--2

        var box2=document.getElementById("box2");

        box2.addEventListener("click",()=>{
            
            box2.style.display="none";
        });

    </script>
</body>
</html>