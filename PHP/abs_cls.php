<?php
abstract class Car{
    public $name;
    public function __construct($name){
        $this->name=$name;
    }
     abstract public function intor():string;
}
class Audi extends Car{
    public function intor(): string
    {
        return 'This is audi';
    }
}
    class Honda extends Car{
        public function intor(): string
        {
            return 'This is honda';
        }
    }
    
    class Yamaha extends Car{
        public function intor(): string
        {
            return 'this is yamaha';
        }
    }

          function sum($x,$y){
            return $x+$y;
        } 

 


?>