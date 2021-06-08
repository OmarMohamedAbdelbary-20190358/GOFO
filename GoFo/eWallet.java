
public class eWallet {
        private float money =0.0;
        public float GetMoney()
        {
        	return money;
        }
        public void SetMoney(float M)
        {
        	money = M;
        }
        
        public void AddMoney(float M)
        {
        	money = money+ M;
        }
        
        public bool subtractMoney(float M)
        {
        	if (money < M)
        	{
        		return false;
        	}
        	
        	money = money -  M;
        	return true;
        }       
