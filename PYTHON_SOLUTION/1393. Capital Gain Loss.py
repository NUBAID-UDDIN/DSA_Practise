import pandas as pd

def capital_gainloss(stocks: pd.DataFrame) -> pd.DataFrame:
    buys = stocks[stocks['operation'] == 'Buy'].groupby('stock_name')['price'].sum()
    sells = stocks[stocks['operation'] == 'Sell'].groupby('stock_name')['price'].sum()
 
    net_df = (sells - buys).reset_index()
    net_df.rename(columns={'price': 'capital_gain_loss'}, inplace=True)
    
    return net_df