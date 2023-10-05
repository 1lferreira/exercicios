#include <iostream> 

using namespace std; 

struct No {
    int data; 
    No *next; 
};


void removerNoComeco(No *&head) {
    if (head == NULL){
        cout << "Linked List vazia, nada para deletar" << endl;
        return; 
    }

    No *temp = head;     
    head = head -> next;

    delete temp;
}


void inserirNoComeco(No *&head, int value){
    No *novoNo = new No; 
    
    novoNo -> data = value; 
    novoNo -> next = head; 

    head = novoNo; 
}


void printList(No *head) {
    No *p = head; 
    printf("\n[");

    while(p != NULL) {
        cout << p -> data << " ";
        p = p -> next; 
    }
    printf("]");
}


int main(){

    No *head = new No;  
    head -> data = 1;
    head -> next = NULL;

    No *e2 = new No; 
    e2 -> data = 2;
    e2 -> next = NULL; 

    No *e3 = new No; 
    e3 -> data = 3;
    e3 -> next = NULL; 

    head -> next = e2;
    e2 -> next = e3; 
    
    printList(head);

    removerNoComeco(head);
    removerNoComeco(head);
    removerNoComeco(head);

    printList(head);

    inserirNoComeco(head, 1);
    inserirNoComeco(head, 2);
    inserirNoComeco(head, 3);

    printList(head);
    
    return 0;

}
