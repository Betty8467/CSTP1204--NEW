package midterminclass;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class HtmlValidator {
    Queue<HtmlTag> tagsQueue ;
    public HtmlValidator(){
        tagsQueue = new LinkedList<>();
    }
    public HtmlValidator(Queue<HtmlTag> tags){
        if(tags == null)
            throw new IllegalArgumentException();
        tagsQueue = new LinkedList<>();
        Queue<HtmlTag> tmpQueue = new LinkedList<>();
        for(HtmlTag x : tags){
            tmpQueue.add(x);
        }
        for(HtmlTag x : tmpQueue){
            tagsQueue.add(x);
        }
    }

    public void addTag(HtmlTag tag){
        if(tag == null)
            throw new IllegalArgumentException("");
        tagsQueue.add(tag);
    }

    public Queue<HtmlTag> getTags(){
        Queue<HtmlTag> result = new LinkedList<>();
        Queue<HtmlTag> tmpQueue = new LinkedList<>();
        for(HtmlTag x : tagsQueue){
            tmpQueue.add(x);
        }
        for(HtmlTag x : tmpQueue){
            result.add(x);
        }
        return result;
    }

    public void removeAll(String element){
        for(HtmlTag x : tagsQueue){
            if (x.getElement().equals(element)){
                tagsQueue.remove(x);
            }
        }
    }

    public void validate(){

        Stack<HtmlTag> myTmpStack = new Stack<>();
        int tab = 0;

        for (HtmlTag aTag: tagsQueue){
            if(!aTag.isSelfClosing()){
                String closingTag = "";

                if(!aTag.isOpenTag()) {
                    closingTag = aTag.toString().replace("/","");
                }

                if(aTag.isOpenTag()){
                    for(int i =0 ; i < tab ; i++)
                        System.out.print(" ");
                    System.out.println(aTag);
                    myTmpStack.push(aTag);
                    tab += 4;
                }

                else if(myTmpStack.empty() && !aTag.isOpenTag()){
                    myTmpStack.push(aTag);
                }

                else if(!closingTag.equals(myTmpStack.peek().toString())){
                    System.out.println("ERROR unexpected tag: " + aTag);

                }

                else{

                    for(int i =0 ; i < tab-4 ; i++)
                        System.out.print(" ");
                    System.out.println(aTag.toString());
                    myTmpStack.pop();
                    tab -= 4;
                }
            }

            else if(aTag.isSelfClosing()){
                if(aTag.toString().charAt(1) == '/'){
                    System.out.println("ERROR unexpected tag: " + aTag);
                }
                else{
                    for(int i = 0; i < tab; i++){
                        System.out.print(" ");
                    }
                    System.out.println(aTag);
                }
            }
        }
        if(!myTmpStack.isEmpty())
        {
            while(!myTmpStack.isEmpty()){
                System.out.println("ERROR unclosed tag:" + myTmpStack.pop());
            }
        }

    }
};