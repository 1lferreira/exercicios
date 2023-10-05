#include <iostream>

using namespace std; 

struct No {
    int data; 
    No *next; 
};


void inserirNoFinal(No *&head, int value){
    No *novoNo = new No; 
    novoNo -> data = value; 
    novoNo -> next = NULL;

    if (head == NULL){
        head = novoNo;
        return; 
    }

    No *aux = head; 
    while(aux -> next != NULL){
        aux = aux -> next; 
    }

    aux -> next = novoNo;
}


void printList(No *head) {
    No *p = head; 
    printf("\n[");

    while(p != NULL) {
        //printf("%d ", p -> data);
        cout << p -> data << ", ";
        p = p -> next; 
    }
    printf("]");
}


bool linkedListsIdenticas(No *head1, No *head2){

    if(head1 == NULL & head2 == NULL){
        return true;
    }

    if (head1 != NULL && head2 != NULL){
        return (head1 -> data == head2 -> data) && linkedListsIdenticas(head1 -> next, head2 -> next);
    } 

    return false;

}


int main() {

    
    No *head = new No;  
    head -> data = 1;
    head -> next = NULL;

    inserirNoFinal(head, 2);
    inserirNoFinal(head, 3);

    printList(head);

    No *head1 = new No; 
    head1 -> data = 1; 
    head1 -> next = NULL; 
    
    inserirNoFinal(head1, 2);
    inserirNoFinal(head1, 3);

    printList(head1);

    cout << endl;

    if (linkedListsIdenticas(head, head1)){
        cout << "As LinkedLists sao indenticas" << endl;
    } else {
        cout << "As LInkedLists nao sao identias" << endl;
    }

    return 0;

}
