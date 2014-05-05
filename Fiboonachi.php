<html>
<head>
<title>Fibonachi 2</title>
</head>
<body>
<?
$a=0; 
$b=1; 
echo $a.",".$b;
for ($s=0;$s<=10;$s++){ 
   $c=$a+$b;
   $a=$b;
   $b=$c;
   echo ",".$c;
}
?>
</body>
</html>
