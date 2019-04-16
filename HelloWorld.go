package main

import "C"  
import "fmt"

//export HeavyWorkFromGo
func HeavyWorkFromGo(num int) {
    fmt.Printf("HeavyWork in Go: %d\n", num)
}

func main(){
    
}
