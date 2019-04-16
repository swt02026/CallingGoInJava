package main

import "C"  
import "fmt"

//export HeavyWorkFromGo
func HeavyWorkFromGo(num int) {
    fmt.Printf("HeavyWorkFromGo: %d\n", num)
}

func main(){
    
}
