/*Copyright [2021] [Juan Cordero]
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

/**
 * Es la clase Principal del programa que procesará una petición
 *
 * @author Juan Cordero
 * @version 1.0 22/10/21
 */
package aplicacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("fichero.txt");
            fw.write("Contenido del fichero");
            fw.close();
        } catch (IOException exception){
            System.out.println("Algo ha fallado al intentar escribir en el fichero");
        }
        System.out.println("Se ha escrito el fichero");

        try {
            Scanner sc = new Scanner(new File("fichero.txt"));
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
                sc.close();
        } catch (FileNotFoundException e){
            System.out.println("Hubo un error");
        }
    }
}