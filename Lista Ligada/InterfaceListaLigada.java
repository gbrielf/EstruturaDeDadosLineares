public interface InterfaceListaLigada{
        // insertBefore, insertAfter, remove, size, isEmpty, first, last
        public int insertBefore(Object objeto, No no);
        public int insertAfter(Object objeto, No no);
        public Object remove(No no);
        public int size();
        public boolean isEmpty();
        public Object first();
        public Object last();        
        }
